package com.meritamerica.onlinebank.controllers;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.services.AccountService;
import com.meritamerica.onlinebank.services.UserService;


@Controller
public class AccountController {
	
	private final AccountService accountService;
	private final UserService userService;
	public AccountController(AccountService accountService ,UserService userService ) {
		this.accountService = accountService;
		this.userService = userService;
	}

	@RequestMapping("/accounts")
	public String accounts(){
	return "/Account.jsp";
	}

	
	
	@RequestMapping("/accounts/{id}")
	public String showProfile(@PathVariable("id")Long id, Model model) {
		
		List<Account> user =  userService.findUsers(id).getAccounts();
		List<User> userAccount = accountService.findAccounts(id).getUsers();
				


		if (user == null) {
			return "redirect:/";
		}else {
			model.addAttribute("account", userAccount);
			model.addAttribute("user", user);


			return "/showAccount.jsp";
		}
		
}

}