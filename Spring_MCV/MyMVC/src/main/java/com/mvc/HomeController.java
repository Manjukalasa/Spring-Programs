package com.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController 
{

	@RequestMapping("/home")
	public String home()
	{
		System.out.println("This is my home page");
		return "index";
	}

	@RequestMapping("/about")
	public String about()
	{
		System.out.println("This is my about");
		return "about";
	}
}
