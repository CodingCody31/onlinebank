package com.meritamerica.onlinebank.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.repositories.SettingRepository;


@Service
public class SettingService {

private static SettingRepository settingRepository;
private static User user;
	
	
	public SettingService(SettingRepository settingRepository ) {
		SettingService.settingRepository = settingRepository;
	}
	
	public User findUser (Long id) {
		Optional<User> optionalUser = settingRepository.findById(id);
		if (optionalUser.isPresent()) {
			return optionalUser.get();
		} else {
			return null;
		}
	}
	
	public User userAccount(User user) {
		return settingRepository.save(user);
	}	
	
	public void deleteaccount(Long id) {
		settingRepository.deleteById(id);	
	}
	
	public User updateUser(Long id, String first_name, String last_name, String username, String password, String 
			email) {
		User user = findUser(id);
		user.setFirst_name(first_name);
		user.setLast_name(last_name);
		user.setUsername(username);
		user.setPassword(password);
		user.setEmail(email);
		return settingRepository.save(user); 
	}
	public User updateUser(User user) {	
		 return settingRepository.save(user);
	}
}
	


