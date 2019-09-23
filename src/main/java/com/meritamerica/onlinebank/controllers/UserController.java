package com.meritamerica.onlinebank.controllers;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.meritamerica.onlinebank.models.User;
import com.meritamerica.onlinebank.services.UserService;

@Controller
public class UserController {
	
	private final UserService userService;
	
	public UserController(UserService userService) {
		this.userService = userService;
	}
	@RequestMapping("/signup")
	public String signUp(@ModelAttribute("user") User user) {
		return "/SignUp.jsp";
	}

	@RequestMapping("/")
	public String login() {
		return "/Home.jsp";
	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	public String registerUser(@Valid @ModelAttribute("user") User user, BindingResult result, HttpSession session) {
		// if result has errors, return the registration page (don't worry about
		// validations just now)
		if(result.hasErrors()) {
			return "/signup";
		} else {
			User u = userService.registerUser(user);
			session.setAttribute("userId", u.getUser_id());
			return "redirect:/home";
		}
		// else, save the user in the database, save the user id in session, and
		// redirect them to the /home route
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestParam("email") String email, @RequestParam("password") String password, Model model,
			HttpSession session) {
		boolean isAuthenticated = userService.authenticateUser(email, password);
		if(isAuthenticated) {
			User u = userService.findByEmail(email);
			session.setAttribute("userId", u.getUser_id());
			return "redirect:/accounts";
		}
		else {
			model.addAttribute("error", "Invalid Credentials. Please try again");
			return "/home";
		}
//		 if the user is authenticated, save their user id in session
//		 else, add error messages and return the login page
	}

	@RequestMapping("/home")
	public String home(HttpSession session, Model model) {
		// get user from session, save them in the model and return the home page
		Long userId = (Long) session.getAttribute("userId");
		User u = userService.findUsers(userId);
		model.addAttribute("user", u);
		return "/Home.jsp";
	}
//
//	@RequestMapping("/logout")
//	public String logout(HttpSession session) {
//		// invalidate session
//		// redirect to login page
//	}
}
