package com.meritamerica.onlinebank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class AccountController {
	
	@RequestMapping("/accounts")
	public String accounts(){
	return "/Account.jsp";
	}

}
