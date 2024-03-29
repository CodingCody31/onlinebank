package com.meritamerica.onlinebank.services;

import java.util.Optional;
import java.util.Random;

import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.repositories.AccountRepository;

@Service
public class AccountService {

	private static AccountRepository accountRepository;
	private static UserService userService;

	public AccountService(AccountRepository accountRepository, UserService userService) {
		this.accountRepository = accountRepository;
		this.userService = userService;
	}

	public Account createAccount(Long id, String type, Account account) {
		Random random = new Random();
		User u = userService.findUsers(id);
		account.setUser(u);
		account.setType(type);
		Integer accNum = random.nextInt();
		account.setAcc_num(accNum);
		account.setAmount(0.0);
		return accountRepository.save(account);
	}

	public Account findAccounts(Long id) {
		Optional<Account> optionalAccounts = accountRepository.findById(id);
		if (optionalAccounts.isPresent()) {
			return optionalAccounts.get();
		} else {
			return null;
		}
	}

	public void updateDeposit(long id, double d) {
		Account account = findAccounts(id);
		System.out.print("Update Deposit --- >" + account);
		System.out.print("Update Deposit --- >" + account.getType());

		account.setAmount(d + account.getAmount());
		System.out.print("Set Amount --- >" + d + account.getAmount());

		accountRepository.save(account);
	}

	public void updateWithdraw(long id, double d, Model model) {

		Account account = findAccounts(id);
		System.out.print("Update Deposit --- >" + account);
		account.setAmount(account.getAmount() - d);

		accountRepository.save(account);
	}

}
