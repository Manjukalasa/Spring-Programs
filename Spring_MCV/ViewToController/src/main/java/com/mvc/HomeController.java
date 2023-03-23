package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController 
{
	@RequestMapping("/form")
	public String form()
	{
		System.out.println("This is my form page");
		return "index";
	}
	@RequestMapping(path = "/process",method = RequestMethod.POST)
	public String getForm(@RequestParam("name")String username,@RequestParam("email")String useremail
			,@RequestParam("password")String password,Model model)
	{
		System.out.println(username);
		System.out.println(useremail);
		System.out.println(password);
		model.addAttribute("name", username);
		model.addAttribute("email", useremail);
		model.addAttribute("password", password);
		return"success";
	}
}