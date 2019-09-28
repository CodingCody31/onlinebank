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

	@RequestMapping("/accounts/{id}")
	public String showAccount(@PathVariable("id") Long id, Model model) {
		List<Account> user = userService.findUsers(id).getAccounts();

//		List<User> userAccount = accountService.findAccounts(id).getUsers();
		if (user == null) {
			return "redirect:/";
		} else {
//			model.addAttribute("account", userAccount);

			// String users = userService.findUsers(id).getFirst_name();

			if (user == null) {
				return "redirect:/";
			} else {
				// model.addAttribute("users", users);

				model.addAttribute("user", user);
				return "/showAccount.jsp";
			}
		}
	}

	@RequestMapping("/accounts/deposit/{id}")
	public String editLanguage(@PathVariable("id") Long id, Model model) {
		System.out.println("Are we getting in here?");
		Account account = accountService.findAccounts(id);
		model.addAttribute("account", account);
		return "/Deposit.jsp";
	}

	@RequestMapping("/accounts/withdraw/{id}")
	public String whithdraw(@PathVariable("id") Long id, Model model) {
		System.out.println("withdraw");

		Account account = accountService.findAccounts(id);
		model.addAttribute("account", account);
		return "/Withdraw.jsp";
	}

	@RequestMapping(value = "/deposit/{id}", method = RequestMethod.PUT)
	public String edit(@PathVariable("id") Long id, @Valid @ModelAttribute("amount") double amount, Model model,
			HttpSession session) {
		Account account = accountService.findAccounts(id);
		User user = userService.findUsers(id);
		model.addAttribute("account", account);
		System.out.println(amount);
		System.out.println(account.getAmount());

		accountService.updateDeposit(id, amount);
//		 session.setAttribute("userId",user.getUser_id());

		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUsers(userId);

		return "redirect:/accounts/" + userId;

	}

	@RequestMapping(value = "/withdraw/{id}", method = RequestMethod.PUT)
	public String editWithdraw(@PathVariable("id") Long id, @Valid @ModelAttribute("amount") double amount, Model model,
			HttpSession session) {
		Account account = accountService.findAccounts(id);
		model.addAttribute("account", account);
		System.out.println(amount);
		System.out.println(account.getAmount());
		accountService.updateWithdraw(id, amount, model);
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUsers(userId);
		return "redirect:/accounts/" + userId;

	}

}