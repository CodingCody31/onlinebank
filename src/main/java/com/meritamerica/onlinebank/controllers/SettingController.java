package com.meritamerica.onlinebank.controllers;

import java.util.List;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.services.SettingService;

@Controller
public class SettingController {
	private final SettingService settingService;

	public SettingController(SettingService settingService) {
	     this.settingService = settingService;
	 }
	 

	@RequestMapping("/useraccount/new")
	  public String newUser(@ModelAttribute("user") User user) {
	      return "/users/setting.jsp";
	  }
	
	
	}