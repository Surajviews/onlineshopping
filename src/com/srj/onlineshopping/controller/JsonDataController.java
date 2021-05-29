package com.srj.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srj.onlineshopping.model.Product;
import com.srj.onlineshopping.service.ProductService;



@Controller
@RequestMapping("/json/data") 
public class JsonDataController {

	@Autowired
	ProductService productService;
	
	@RequestMapping("/all/products")
	@ResponseBody //this annotation send the data in the form of Json
	public List<Product> getAllProducts(){
		return productService.listActiveProduct();
	}
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody 
	public List<Product> getProductsByCategory(@PathVariable int id){
		return productService.listActiveProductByCategory(id);
	}
	
}
