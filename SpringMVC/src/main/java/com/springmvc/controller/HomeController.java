package com.springmvc.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.springmvc.entity.User;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String homePage(Model model) {
		
		model.addAttribute("name", "Hashim Ansari");
		
		Map<Integer, String> hashMap = new HashMap<Integer , String>();
		hashMap.put(343, "Hashim Ansari");
		hashMap.put(234, "Salim Ansari");
		hashMap.put(654, "Qasim Ansari");
		hashMap.put(844, "Aasim Ansari");
		
		model.addAttribute("list",hashMap);
		
//		String str=null;
//		str.charAt(0);
//		
//       Integer.parseInt("3543537645");
		
		return "home";
	}
	
	@RequestMapping(path="/login", method = RequestMethod.GET)
	public ModelAndView loginPage(){
		
		ModelAndView view = new ModelAndView();
		
		view.addObject("standard", "BSC_IT");
		view.addObject("rollNo",2345);
		
		List<String> list = new ArrayList<String>();
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("Java Script");
		list.add("Html");
		list.add("CSS");
		
		view.addObject("course",list);
		
		view.setViewName("login");
		
		return view;
	}
	@RequestMapping("/register")
	public String register() {
		return"register";
	}
	@RequestMapping(path="/createUser", method=RequestMethod.POST)
	public String createUser(@ModelAttribute User user) {
		System.out.println(user);
		return "register"; 
	}
}
