package com.srj.onlineshopping.repository;

import java.util.List;

import com.srj.onlineshopping.model.Category;

public interface CategoryRepository {

	List<Category> list();
	
	Category get(int id);
	
}
