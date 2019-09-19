package com.meritamerica.onlinebank.repositories;



import java.util.List;

import javax.validation.Valid;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.models.User;

@Repository
public interface AccountRepository extends CrudRepository <Account, Long> {
	
	List<Account> findAll();



}

