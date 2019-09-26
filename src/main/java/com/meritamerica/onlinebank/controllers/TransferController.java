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
public class TransferController {

	private final AccountService accountService;
	private final UserService userService;

	public TransferController(AccountService accountService, UserService userService) {
		this.accountService = accountService;
		this.userService = userService;
	}

	@RequestMapping("/transfers/{id}")
	public String showAccount(@PathVariable("id") Long id, Model model) {

		List<Account> user = userService.findUsers(id).getAccounts();

		if (user == null) {
			return "redirect:/";
		} else {
			model.addAttribute("user", user);

			return "/TransferProcess.jsp";
		}

	}
}
