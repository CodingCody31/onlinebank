package com.meritamerica.onlinebank.controllers;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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


	
public String createaccount(@Valid @ModelAttribute("user") User user, BindingResult result) {
	System.out.println("hit route correctly");
	if(result.hasErrors()) {
		System.out.println("escaped due to errors");
		return "newaccount";			
	}
	System.out.println("creating account");
	settingService.addAccount(user);
	return "redirect:/accounts";
}
	

//create account
	@RequestMapping(value="/account/new", method=RequestMethod.POST)
	public String addaccount(@Valid @ModelAttribute("user") User user, BindingResult result) {
		System.out.println("hit route correctly");
		if(result.hasErrors()) {
			System.out.println("escaped due to errors");
			return "newaccount";			
		}
		System.out.println("creating account");
		settingService.addAccount(user);
		return "redirect:/accounts";



	}
	
	@RequestMapping("/update") 
	 public String updateUser(long id, String email, String name) {
	    return "User successfully updated";
	  }	
	
	
	@RequestMapping("/delete")
	  	  public String delete(long id) {
	    
	    return "User successfully deleted";
	  }
	
	
	
	}


	