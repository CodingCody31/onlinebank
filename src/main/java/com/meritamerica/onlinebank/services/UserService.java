package com.meritamerica.onlinebank.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.repositories.AccountRepository;
import com.meritamerica.onlinebank.repositories.UserRepository;
import org.mindrot.jbcrypt.BCrypt;

@Service

public class UserService {
	
private static UserRepository userRepository;
private static AccountRepository accountRepository;

	
	public  UserService(UserRepository userRepository ,AccountRepository accountRepository ) {
		this.userRepository = userRepository;
		this.accountRepository = accountRepository;
	}

		
	public User findUsers(Long id) {
		Optional <User> optionalUser = userRepository.findById(id);
     // Optional <Account> optionalAccount = accountRepository.findById(id);
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			return null;
		}
		
	}
	public User registerUser(User user) {
		String hashed = BCrypt.hashpw(user.getPassword(), BCrypt.gensalt());
		user.setPassword(hashed);
		return userRepository.save(user);
	}
	
	  public User findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
			
	  public boolean authenticateUser(String email, String password) {
        // first find the user by email
        User user = userRepository.findByEmail(email);
        // if we can't find it by email, return false
        if(user == null) {
            return false;
        } else {
            // if the passwords match, return true, else, return false
            if(BCrypt.checkpw(password, user.getPassword())) {
            	return true;
            } else {
                return false;
            }
        }
	  }


		
	}
	


