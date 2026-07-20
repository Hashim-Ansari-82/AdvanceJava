package com.interceptor.controller;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.interceptor.entity.User;

@Controller
public class HomeController {

	@RequestMapping("/home")
	public String home() {
		return "home";
	}
	
	@RequestMapping("/login")
	public String login(HttpSession session) {
		session.setAttribute("loginUser", new User("Hashim Ansari"));
		return "home";
	}
}
