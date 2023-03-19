package com.mvc;

import java.util.ArrayList;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller                     // make the class as controller class
public class HomeController 
{

	@RequestMapping("/home")    // it is used to set URL to my web page
	public String home(Model model)  // using Model
	{
		 model.addAttribute("id",101);
		 model.addAttribute("name","Manjunth B kalasa");
		 model.addAttribute("age",22);
		 
		 List<String> friends=new ArrayList<String>();
		 friends.add("Mallu");
		 friends.add("Sachin");
		 friends.add("Abhishek");
		 model.addAttribute("f",friends);
		 return "index";
	}
	
	@RequestMapping("/help") 
	public ModelAndView help( )     
	{
		ModelAndView view= new ModelAndView();   // using ModelAndView
		view.addObject("id",111);
		view.addObject("name","mbk");
		view.addObject("age",23);
		view.setViewName("help");
		 return view;
	}
}
