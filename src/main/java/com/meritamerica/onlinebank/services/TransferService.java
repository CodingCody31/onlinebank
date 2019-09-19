package com.meritamerica.onlinebank.services;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.repositories.AccountRepository;
import com.meritamerica.onlinebank.repositories.TransferRepository;



public class TransferService {
	
	private static TransferRepository transferRepository;
	public TransferService(TransferRepository transferRepository) {
		this.transferRepository = transferRepository;
	}

	 
	public Account findAccounts (Long id) {
		Optional<Account> optionalAccount = transferRepository.findById(id);
		if (optionalAccount.isPresent()) {
			return optionalAccount.get();
		} else {
			return null;
		}
	}
	
	
	
//	public Account depositMoney(double amount) {
//		AccountBalance += amount;
//	}
//	
//	public double withdrawMoney(double amount) {
//		if(amount > AccountBalance) {
//			return AccountBalance;
//		}else {
//			AccountBalance -= amount;
//			return AccountBalance;
//		}
//	}

	public static boolean authenticateAccount(String acc_num, String account_id){
		return true;
	}
	
	

}
