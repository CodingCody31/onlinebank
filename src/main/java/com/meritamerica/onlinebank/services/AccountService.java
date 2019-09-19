package com.meritamerica.onlinebank.services;

import java.security.Principal;
import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.stereotype.Service;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.repositories.AccountRepository;
import com.meritamerica.onlinebank.services.AccountService;

@Service
public class AccountService {
	
	private static AccountRepository accountRepository;
	
	public  AccountService(AccountRepository accountRepository) {
		this.accountRepository = accountRepository;
	}
	
	
	

	
	
		public Account findAccounts(Long id) {
			Optional<Account> optionalAccounts = accountRepository.findById(id);
			if (optionalAccounts.isPresent()) {
				return optionalAccounts.get();
			} else {
				return null;
			}
		}




	public void updateDeposit( long id , double d) {
		Account account = findAccounts(id);
		System.out.print("Update Deposit --- >" + account);
		account.setAmount(d + account.getAmount());
		System.out.print("Set Amount --- >" + d + account.getAmount());

		
		accountRepository.save(account);
		}

	public void updateWithdraw( long id , double d) {
		Account account = findAccounts(id);
		System.out.print("Update Deposit --- >" + account);
		account.setAmount(d + account.getAmount());
			
		accountRepository.save(account);
		}






		
		
		
		

	
	}
