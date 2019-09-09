package com.meritamerica.onlinebank.services;

import java.util.Optional;


import org.springframework.stereotype.Service;
import org.springframework.ui.Model;


import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.repositories.SettingRepository;


@Service
public class SettingService {
	private final SettingRepository settingRepository;
	
	
	public SettingService(SettingRepository settingRepository ) {
		this.settingRepository = settingRepository;
	}
	
	public Optional<User> findUser (Long id) {
		return settingRepository.findById(id);
	}
	
	
	
	public User addAccount(User current) {
		return settingRepository.save(current);
	}
	
	public void deleteaccount(Long id) {
		settingRepository.deleteById(id);
		
		//create button delete account
		
		
		
	}
	
	
}



