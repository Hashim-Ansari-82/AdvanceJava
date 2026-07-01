package com.form.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.form.entity.User;
import com.form.service.UserService;

@Controller
public class HomeController {

	@Autowired
	private UserService userService;
	
	@RequestMapping("/home")
	public String home() {
		
		return "home";
	}
	@RequestMapping("/register")
	public String register() {
		return "register";
	}
	
	@RequestMapping(path="/createUser" , method = RequestMethod.POST)
	public String createUser(@ModelAttribute User user,Model model) {
		
		userService.registerUser(user);
		model.addAttribute(user);
		/* return "redirect:/register"; */
		return "success";
	}

}
