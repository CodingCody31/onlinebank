package com.meritamerica.onlinebank.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping
public class OnlineBank {

	
		@RequestMapping("")
		public String index(){
		return "index.jsp";
		}

		@RequestMapping("/main")
		public String main(){
		return "main.jsp";
		}
		@RequestMapping("/newAccount")
		public String newAccount(){
		return "newAccount.jsp";
		}

		@RequestMapping("/aboutus")
		public String aboutus(){
		return "aboutus.jsp";
		}
		@RequestMapping("/main/checking")
		public String checking (Model model){
		//add or update model attribute here
		return "checking.jsp";
		}

		@RequestMapping("/main/checking/personal")
		public String pchecking (Model model){
		//add or update model attribute here
		return "personalchecking.jsp";
		}

		@RequestMapping("/main/checking/dba")
		public String dba (Model model){
		//add or update model attribute here
		return "dba.jsp";
		}

		@RequestMapping("/main/saving")
		public String saving (Model model){
		//add or update model attribute here
		return "saving.jsp";
		}
		@RequestMapping("/main/saving/personal")
		public String psaving (Model model){
		//add or update model attribute here
		return "psaving.jsp";
		}

		@RequestMapping("/main/saving/cd")
		public String cd (Model model){
		//add or update model attribute here
		return "cd.jsp";
		}

		@RequestMapping("/main/ira")
		public String ira (Model model){
		//add or update model attribute here
		return "ira.jsp";
		}

		@RequestMapping("/main/ira/roth")
		public String roth (Model model){
		//add or update model attribute here
		return "roth.jsp";
		}
		@RequestMapping("/main/ira/rollover")
		public String rollover (Model model){
		//add or update model attribute here
		return "irollover.jsp";
		}

		@RequestMapping("/main/ira/regular")
		public String regular (Model model){
		//add or update model attribute here
		return "regular.jsp";
		}

		}	
	

