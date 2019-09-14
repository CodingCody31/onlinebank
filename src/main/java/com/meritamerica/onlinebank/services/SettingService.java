package com.meritamerica.onlinebank.services;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

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
	
	
	public User addAccount(@Valid User user) {
		return settingRepository.save(user);
	}	
	public void deleteaccount(Long id) {
		settingRepository.deleteById(id);
		
		
		 
		}
	
}
	
	




