package com.cg.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class WelcomeController {

	@RequestMapping("/hello")
	public String process() {	
		
		return "success"; 
	}
	
	@RequestMapping("/getlogin")
	public String loginForm() {		
		
		return "loginform"; 
	}	
	
	@RequestMapping("/login")
	public String doLogin(@RequestParam("user") String username, Model model) {	
		
		model.addAttribute("myusername", username);
		
		return "loginsuccess"; 
	}
	
}
