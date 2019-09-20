package com.meritamerica.onlinebank.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.onlinebank.models.User;

@Repository

	
	public interface UserRepository extends CrudRepository <User, Long> {

		
		
		User findByEmail(String email);

	}

