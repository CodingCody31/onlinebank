package com.meritamerica.onlinebank.controllers;

import java.util.List;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.services.AccountService;
import com.meritamerica.onlinebank.services.UserService;

public class TransferController {
	
	private final AccountService accountService;
	private final UserService userService;
	public TransferController(AccountService accountService ,UserService userService ) {
		this.accountService = accountService;
		this.userService = userService;
	}

	@RequestMapping("/transfers")
	public String accounts(){
	return "/Transfer.jsp";
	}

	
	
	@RequestMapping("/transfers/{id}")
	public String showProfile(@PathVariable("id")Long id, Model model) {
		
		List<Account> user =  userService.findUsers(id).getAccounts();
		List<User> userAccount = accountService.findAccounts(id).getUsers();
				


		if (user == null) {
			return "redirect:/";
		}else {
			model.addAttribute("account", userAccount);
			model.addAttribute("user", user);


			return "/Transfer.jsp";
		}
		
}

}
