package com.meritamerica.onlinebank.controllers;

import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.services.AccountService;
import com.meritamerica.onlinebank.services.TransferService;
import com.meritamerica.onlinebank.services.UserService;

@Controller
public class TransferController {

	private final AccountService accountService;
	private final UserService userService;
	private final TransferService transferService;

	public TransferController(AccountService accountService, UserService userService, TransferService transferService) {
		this.accountService = accountService;
		this.userService = userService;
		this.transferService = transferService;
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

	@RequestMapping(value = "/transfers", method = RequestMethod.POST)
	public String transfer(@RequestParam("Transfers_from") Long fromId, @RequestParam("Transfers") Long toId, @Valid @ModelAttribute("amount") double amount, Model model,
			HttpSession session) {
		Account account = transferService.findAccounts(id);
		Account fromAccount = transferService.findAccounts(fromId);
		Account toAccount = transferService.findAccounts(toId);
		

	}

}
