package com.meritamerica.onlinebank.services;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.repositories.AccountRepository;
import com.meritamerica.onlinebank.repositories.TransferRepository;


@Service
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
	
	public void transfer(Long fromId, Long toId, double amount) {

        Account fromAccount = findAccounts(fromId);
        Account toAccount = findAccounts(toId);
        fromAccount.setAmount(fromAccount.getAmount() - amount);
        toAccount.setAmount(toAccount.getAmount() + amount);
        transferRepository.save(fromAccount);
        transferRepository.save(toAccount);
    }

	public static boolean authenticateAccount(String acc_num, String account_id){
		return true;
	}
	
	

}
