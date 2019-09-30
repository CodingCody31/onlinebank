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

	static long vUser_Id;

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

	@RequestMapping("/accounts/deposit")
	public String editLanguage(HttpSession session, Model model) {
		System.out.println("Are we getting in here?");
		Long userId = (Long) session.getAttribute("userId");
		Account account = accountService.findAccounts(userId);
		model.addAttribute("account", account);
		return "/Deposit.jsp";
	}

	@RequestMapping("/accounts/withdraw")
	public String whithdraw(HttpSession session, Model model) {
		System.out.println("withdraw");
		Long userId = (Long) session.getAttribute("userId");

		Account account = accountService.findAccounts(userId);
		model.addAttribute("account", account);
		return "/Withdraw.jsp";
	}

	@RequestMapping(value = "/deposit", method = RequestMethod.PUT)
	public String edit(@RequestParam("amount") double amount, Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		Account account = accountService.findAccounts(userId);
		User user = userService.findUsers(userId);
		model.addAttribute("account", account);
		System.out.println(amount);
		System.out.println(account.getAmount());

		accountService.updateDeposit(userId, amount);
//		 session.setAttribute("userId",user.getUser_id());

		
		User u = userService.findUsers(userId);

		return "redirect:/accounts";

	}

	@RequestMapping(value = "/withdraw", method = RequestMethod.PUT)
	public String editWithdraw(@RequestParam("amount") double amount, Model model,
			HttpSession session) {
		Long userId = (Long) session.getAttribute("userId");
		Account account = accountService.findAccounts(userId);
		model.addAttribute("account", account);
		System.out.println(amount);
		System.out.println(account.getAmount());
		accountService.updateWithdraw(userId, amount, model);
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
			accountService.createAccount(type, account);
			return "redirect:/showAccount";
		}
	}
}
