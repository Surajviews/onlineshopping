package com.srj.onlineshopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	
	@RequestMapping(value={"/", "/home"})
	public ModelAndView home(){
		
		ModelAndView mv=new ModelAndView("homepage");
		mv.addObject("message", "Wellcome to the Spring MVC");
		
		return mv;
	}
	
}
