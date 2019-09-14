package com.meritamerica.onlinebank.repositories;



import org.springframework.data.repository.CrudRepository;


public interface AccountRepository {

	void deleteById(Long id);

}

