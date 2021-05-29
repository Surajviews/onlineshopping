package com.srj.onlineshopping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.srj.onlineshopping.model.Product;
import com.srj.onlineshopping.repository.ProductRepository;

@Controller
@RequestMapping("/json/data")
public class JsonDataController {

	@Autowired
	ProductRepository productRepository;
	
	@RequestMapping("/all/products")
	@ResponseBody //this annotation send the data in the form of Json
	public List<Product> getAllProducts(){
		return productRepository.listActiveProduct();
	}
	
	@RequestMapping("/category/{id}/products")
	@ResponseBody 
	public List<Product> getProductsByCategory(@PathVariable Long id){
		return productRepository.listActiveProductByCategory(id);
	}
	
}
