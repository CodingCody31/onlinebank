package com.meritamerica.onlinebank.controllers;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.meritamerica.onlinebank.models.Account;
import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.services.AccountService;
import com.meritamerica.onlinebank.services.UserService;

@Controller
public class AccountController {

	static long vAccound_ID;

	private final AccountService accountService;
	private final UserService userService;

	public AccountController(AccountService accountService, UserService userService) {
		this.accountService = accountService;
		this.userService = userService;
	}

	@RequestMapping("/accounts")
	public String accounts() {
		return "/Account.jsp";
	}

	@RequestMapping("/showAccount")
	public String showAccount(HttpSession session, Model model) {
		if(session.getAttribute("userId")== null) {
			return "/";
		}
		Long userId = (Long) session.getAttribute("userId");
		List<Account> user = userService.findUsers(userId).getAccounts();

			if (user == null) {
				return "redirect:/";
			} else {
				model.addAttribute("user", user);
				return "/showAccount.jsp";
			}
		}

	@RequestMapping(value = "/deposit/{id}")
	public String editLanguage(@PathVariable("id")Long id,@ModelAttribute("account")Account account, HttpSession session, Model model) {
		System.out.println("Are we getting in here?");
		Long userId = (Long) session.getAttribute("userId");
//		Account account = accountService.findAccounts(userId);
		model.addAttribute("account", account);
		vAccound_ID=id;
		return "/Deposit.jsp";
	}

	@RequestMapping("/withdraw/{id}")
	public String whithdraw(@PathVariable("id")Long id,@ModelAttribute("account")Account account, HttpSession session, Model model) {
		System.out.println("withdraw");
		Long userId = (Long) session.getAttribute("userId");
		vAccound_ID=id;

//		Account account = accountService.findAccounts(userId);
		model.addAttribute("account", account);
		return "/Withdraw.jsp";
	}

	@RequestMapping(value = "account/deposit/", method = RequestMethod.POST)
	public String edit(@RequestParam("amount") double amount, Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		Account account = accountService.findAccounts(vAccound_ID);
		User user = userService.findUsers(userId);
		Long accountId = account.getAccount_id();

		accountService.updateDeposit(vAccound_ID, amount);
		
		User u = userService.findUsers(userId);

		return "redirect:/accounts";

	}

	@RequestMapping(value = "account/withdraw/", method = RequestMethod.POST)
	public String editWithdraw(@RequestParam("amount") double amount, Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		Account account = accountService.findAccounts(vAccound_ID);
	
		accountService.updateWithdraw(vAccound_ID, amount, model);
		User u = userService.findUsers(userId);
		return "redirect:/accounts";

	}
	
	@RequestMapping("/createAccount")
	public String showCreate(@ModelAttribute("account") Account account, HttpSession session, Model model) {
		Long userId = (Long)session.getAttribute("userId");
		return "/CreateAccount.jsp";
	}

	@RequestMapping(value = "/createAccount", method = RequestMethod.POST)
	public String createAccount(@Valid @ModelAttribute("account") Account account, @RequestParam ("type") String type, BindingResult result, HttpSession session) {
		// if result has errors, return the registration page (don't worry about
		// validations just now)
		Long userId = (Long) session.getAttribute("userId");
		if(result.hasErrors()) {
			return "/CreateAccount.jsp";
		} else {
			accountService.createAccount(userId, type, account);
			return "redirect:/showAccount";
		}
	}
}
