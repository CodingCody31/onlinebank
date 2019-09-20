package com.meritamerica.onlinebank.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.services.SettingService;
import com.meritamerica.onlinebank.services.UserService;



@Controller
public class SettingController {
	private final UserService userService;
	private final SettingService settingService;

	public SettingController(SettingService settingService, UserService userService) {
	     this.settingService = settingService;
	     this.userService = userService;
	 }
	
	@RequestMapping("/settings/{id}")
	public String settings(@PathVariable("id") Long id, Model model) {
		User user = userService.findUsers(id);
		model.addAttribute("user", user);
		return "/Setting.jsp";
	}
	
	@RequestMapping("/update/{id}")
	public String updateuser(@PathVariable("id") Long id, Model model) {
		User user = userService.findUsers(id);
		model.addAttribute("user", user);
		return "/UserUpdate.jsp";
	}

	@RequestMapping(value="/update/{id}", method=RequestMethod.PUT)
	   public String updateuser(@PathVariable("id") Long id, @Valid @ModelAttribute("user") User user , Model model, BindingResult result) {
	    model.addAttribute("user", user);
	    user.setUser_id(id);
	    if (result.hasErrors()) {
	           return "/UserUpdate.jsp";
	       } else {
	    	   settingService.updateUser(user);
	           return "redirect:/settings/{id}";
	       }
	   }
	
	@RequestMapping("/delete")
	  	  public String delete(long id) {
	    
	    return "User successfully deleted";
	  }
	
	
	
	}


	