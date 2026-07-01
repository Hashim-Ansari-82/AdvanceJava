package com.form.controller;

import java.io.File;
import java.io.FileOutputStream;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;
import org.springframework.web.servlet.view.RedirectView;

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

	@RequestMapping(path = "/createUser", method = RequestMethod.POST)
	public String createUser(@ModelAttribute User user, Model model) {

		userService.saveUser(user);
		return "success";
	}

	@RequestMapping("/google")
	public String redirectPage() {
		return "redirect:https://www.google.com";
	}

	@RequestMapping("/yahoo")
	public RedirectView redirectYahoo() {
		RedirectView view = new RedirectView();
         view.setUrl("https://in.search.yahoo.com/");
         return view;
	}
	@RequestMapping("/search")
	public String keyword() {
		return "search"; 
	}
	@RequestMapping(path="/search", method = RequestMethod.POST)
	public String search(@RequestParam("keyword") String keyword) {
		String url="https://www.google.com/search?q="+keyword;
		return "redirect:"+url; 
	}
	@RequestMapping("/user/{id}/{name}")
	public String demo(@PathVariable("id")int id,@PathVariable String name) {
		System.out.println("Id = "+id);
		System.out.println("Name = "+name);
		return "home";
	}
	@RequestMapping("/file_Upload")
	public String file_Upload() {
		return "fileUpload";
	}
	@SuppressWarnings("resource")
	@RequestMapping(path="/fileUpload" , method=RequestMethod.POST)
	public String fileUpload(@RequestParam("img") CommonsMultipartFile file, HttpServletRequest req,Model model) {
		System.out.println(file.getName());
		System.out.println(file.getOriginalFilename());
		System.out.println(file.getContentType());
		System.out.println(file.getSize());
		
		byte[] bytes = file.getBytes();
//		String path = req.getServletContext().getResourcePaths("/")
//		+"WEB-INF"+File.separator
//		+"resources"+File.separator
//		+"image"+File.separator
//		+file.getOriginalFilename();
		
		
		String path =
				"C:\\ReviseAdvJava\\Register_Form_ORM\\src\\main\\webapp\\WEB-INF\\resources\\image\\"
				+ file.getOriginalFilename();
		
		System.out.println(path);
		
		try {
			FileOutputStream fos = new FileOutputStream(path);
			fos.write(bytes);
			fos.close();
			System.out.println("File Uploaded Successfully");
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		model.addAttribute("imgName",file.getOriginalFilename());
		
		return "done";
	}
}
