package com.greatlearning.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HelloController {
	@RequestMapping("/ ")
	public String welcome(ModelMap model) { 
	model.addAttribute("massage","hello and welcome to the project");	
	return "hello";
	

}
}