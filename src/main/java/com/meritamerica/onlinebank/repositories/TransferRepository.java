package com.meritamerica.onlinebank.repositories;

import org.springframework.data.repository.CrudRepository;

import com.meritamerica.onlinebank.models.Account;

public interface TransferRepository extends CrudRepository <Account,Long>{

}
