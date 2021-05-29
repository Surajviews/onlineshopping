package com.srj.onlineshopping.service;

import java.util.List;

import com.srj.onlineshopping.model.Category;

public interface CategoryService {

	boolean add(Category category);
	
	Category get(int id);
	
	List<Category> list();

	boolean update(Category category);
	
	boolean delete(Category category);
	
	
	
}
