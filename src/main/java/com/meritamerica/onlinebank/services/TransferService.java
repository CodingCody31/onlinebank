package com.meritamerica.onlinebank.services;

import java.util.Optional;

import javax.persistence.Id;

import org.springframework.data.repository.CrudRepository;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.repositories.AccountRepository;
import com.meritamerica.onlinebank.repositories.TransferRepository;



public class TransferService {
	
	private CrudRepository<Account, Id> accountRepository;
	public TransferService(TransferRepository transferRepository) {
	}
	
	public Account addaccount(Account account) {
		return accountRepository.save(account);
	}
	
	 public Optional<Account> findAccountById(Id id)
	 	 { return accountRepository.findById(id); }
	
	public static int AccountBalance;


	public static void setAccountBalance(int accountBalance) {
		TransferService.AccountBalance = accountBalance;
	}
	
	public static int getAccountBalance() {
		return AccountBalance;
	}
	
	
	public void depositMoney(double amount) {
		AccountBalance += amount;
	}
	
	public double withdrawMoney(double amount) {
		if(amount > AccountBalance) {
			return AccountBalance;
		}else {
			AccountBalance -= amount;
			return AccountBalance;
		}
	}

	public static boolean authenticateAccount(String acc_num, String account_id){
		return true;
	}
	
	

}
