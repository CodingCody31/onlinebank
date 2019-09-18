package com.meritamerica.onlinebank.repositories;



import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.models.User;

@Repository
public interface AccountRepository extends CrudRepository <Account, Long> {
	

<<<<<<< HEAD
public interface AccountRepository extends CrudRepository {
=======
	List<Account> findAll();
>>>>>>> c352c8d7bae135f8e0051fdd9b93c5820f203e80

	
	

}

