package com.meritamerica.onlinebank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	@RequestMapping("/signup")
	public String signUp() {
		return "/SignUp.jsp"; // Robert, the jsp will have to be completed once Jesse sends over the html/css for it. 
	}
	

}
