package com.meritamerica.onlinebank.services;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.meritamerica.onlinebank.models.Address;
import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.repositories.SettingRepository;


@Service
public class SettingService {

private static SettingRepository settingRepository;
	
	
	public SettingService(SettingRepository settingRepository ) {
		SettingService.settingRepository = settingRepository;
	}
	
	public java.util.Optional<User> findUser (Long id) {
		return settingRepository.findById(id);
	}
	
	
	public User userAccount(@Valid User user) {
		return settingRepository.save(user);
	}	
	public void deleteaccount(Long id) {
		settingRepository.deleteById(id);
		
	}
	
	public User updateUser(String first_name, String last_name, String username, String password, String 
			email) {
		
		 User user = new User(first_name, last_name, username, password, email);
				 return settingRepository.save(user);
		 
	}
	public User updateUser(User user) {
		
		
				 return settingRepository.save(user);
		 
	
	}
}
	


