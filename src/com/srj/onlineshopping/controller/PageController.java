package com.srj.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srj.onlineshopping.model.Category;
import com.srj.onlineshopping.service.CategoryService;

@Controller
public class PageController {

	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value={"/", "/home"})
	public ModelAndView home(){
		
		ModelAndView mv=new ModelAndView("homepage");
		mv.addObject("title", "Home");
		
		mv.addObject("categories",categoryService.list());
		
		mv.addObject("userClickHome", true);
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about(){
		
		ModelAndView mv=new ModelAndView("homepage");
		mv.addObject("title", "About Us");
		      mv.addObject("userClickAbout", true);
		return mv;
	}
	
	@RequestMapping(value="/contact")
	public ModelAndView contact(){
		
		ModelAndView mv=new ModelAndView("homepage");
		mv.addObject("title", "Contact Us");
	 mv.addObject("userClickContact", true);
		return mv;
	}
	
	
//	Method to load all the products and based on categories
	@RequestMapping(value = "/show/all/products")
	public ModelAndView showAllProducts(){
		ModelAndView mv=new ModelAndView("homepage");
		mv.addObject("title","All Products");
		
		//passing the list of category
		mv.addObject("categories", categoryService.list());
		
		mv.addObject("userClickAllProducts",true);
		return mv;
	}
	
	@RequestMapping(value = "/show/category/{id}/products")
	public ModelAndView showCategoryProducts(@PathVariable("id") int id){
		ModelAndView mv=new ModelAndView("homepage");
		
		//categoryDAO to fetch single category
		Category category=null;
		category=categoryService.get(id);
		
		mv.addObject("title",category.getName());
		
		//passing the list of category
		mv.addObject("categories", categoryService.list());
		
		//passing the Single Category Object
		mv.addObject("category", category);
		
		mv.addObject("userClickCategoryProducts",true);
		return mv;
	}
	  
}
