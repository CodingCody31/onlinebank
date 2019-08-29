package com.meritamerica.onlinebank.Repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.onlinebank.models.User;

@Repository
public interface SavingsAccount extends CrudRepository <User, Long>{
	
	//  retrieve all the Users from the database
	 List<User> findAll();
	

}
