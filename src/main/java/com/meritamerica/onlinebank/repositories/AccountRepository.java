package com.meritamerica.onlinebank.repositories;

import java.util.List;
import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.onlinebank.models.Account;

@Repository
public interface AccountRepository extends CrudRepository <Account, Id>{

	List<Account>findAccountById();

	static Optional<Account> Id(Id id) {
		
		// TODO Auto-generated method stub
		return null;
	} 
	}


