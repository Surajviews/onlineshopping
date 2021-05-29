package com.srj.onlineshopping.repository;

import java.util.List;

import com.srj.onlineshopping.model.Category;

public interface CategoryRepository {
	
	boolean add(Category category);

	List<Category> list();
	
	Category get(Long id);

boolean update(Category category);
	
	boolean delete(Category category);
	
}
