package com.srj.onlineshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.srj.onlineshopping.model.Category;
import com.srj.onlineshopping.model.Product;
import com.srj.onlineshopping.service.CategoryService;
import com.srj.onlineshopping.service.ProductService;

@Controller
public class PageController {

	@Autowired
	private CategoryService categoryService;
	
	@Autowired
	private ProductService productService;
	
	Category category;
	Product product;
	
	@RequestMapping(value={"/", "/home"})
	public ModelAndView home(){
		
		ModelAndView mv=new ModelAndView("homepage");
		mv.addObject("title", "Home");
		
		mv.addObject("categories",categoryService.list());
		
		mv.addObject("userClickHome", true);			//used to call the page through homepage
		return mv;
	}
	
	@RequestMapping(value="/about")
	public ModelAndView about(){
		
		ModelAndView mv=new ModelAndView("homepage");
		mv.addObject("title", "About Us");
		      mv.addObject("userClickAbout", true);    //used to call the about page through homepage
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
	
	
	@RequestMapping(value="/show/{id}/product")
	public ModelAndView showSingleCategory(@PathVariable int id){
		
		ModelAndView mv=new ModelAndView("homepage");
		
		Product product = productService.get(id);
		
		//update the view count(how many time product view in website by user)
		product.setViews(product.getViews()+1);
		productService.update(product);
		
		mv.addObject("title", product.getName());
		mv.addObject("product", product);
		
		mv.addObject("userClickShowProduct", true);
		
		return mv;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@RequestMapping(value="/test")
	public ModelAndView test(){
		
		 product=new Product();
		product.setActive(true);
		product.setBrand("TATA");
		product.setCategoryId(11L);
		product.setDescription("here is product description");
		product.setName("TATA Product");
		
		productService.add(product);
		
		ModelAndView mv=new ModelAndView("homepage");
		
	 mv.addObject("tested", product);
		
		return mv;
	}
	*/
	  
}
