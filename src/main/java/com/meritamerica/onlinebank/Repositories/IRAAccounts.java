package com.meritamerica.onlinebank.Repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.onlinebank.models.User;

@Repository
public interface IRAAccounts extends CrudRepository<User, Long> {
	
	//  retrieve all the Users from the database
	List<User> findAll();
	
	// delete a User  with a specific email
    Long deleteByEmail(String search);
    Optional<User> findById(Long id);
	void deleteById(Long id);

}
