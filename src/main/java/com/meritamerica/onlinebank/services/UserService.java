package com.meritamerica.onlinebank.services;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.models.Account;

import com.meritamerica.onlinebank.repositories.AccountRepository;
import com.meritamerica.onlinebank.repositories.UserRepository;

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
			Optional <Account> optionalAccount = accountRepository.findById(id);
			if (optionalUser.isPresent()) {
				return optionalUser.get();
			} else {
				return null;
			}
			
		}
		
	}
	


