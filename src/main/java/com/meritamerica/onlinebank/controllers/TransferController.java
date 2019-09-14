package com.meritamerica.onlinebank.controllers;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


import com.meritamerica.onlinebank.services.AccountService;
import com.meritamerica.onlinebank.services.TransferService;

@Controller
public class TransferController {
	private final AccountService accountService;
	
	
	public TransferController(TransferService transferService, AccountService accountService) {
		this.accountService = accountService;
	}

	@RequestMapping("/transfers")
	public String transfers(){
	return "/Transfer.jsp";
	}

	@PostMapping("/transfers/type")
	public String transferAmount(@RequestParam("acc_num") String acc_num , @RequestParam("account_id") String account_id , Model model , HttpSession session) {
		boolean isAuthenticated = TransferService.authenticateAccount(acc_num, account_id);
		if(isAuthenticated) {
						
			model.addAttribute("account",accountService.getaccount_id(id).get());
			return "/Transfer.jsp";
		}else {
			model.addAttribute("error", "Invalid credentials");
			return "/Home.jsp";
		}
	}

}
