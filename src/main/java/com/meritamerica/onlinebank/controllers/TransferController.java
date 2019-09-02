package com.meritamerica.onlinebank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class TransferController {
	@RequestMapping("/transfers")
	public String transfers(){
	return "/Transfer.jsp";
	}

}
