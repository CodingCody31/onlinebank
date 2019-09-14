package com.meritamerica.onlinebank.repositories;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import com.meritamerica.onlinebank.models.User;

@Repository

public interface SettingRepository extends CrudRepository<User, Long> {
	
		

	}

	
	
	
	


