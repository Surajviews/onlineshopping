package com.srj.onlineshopping.service;

import java.util.List;

import com.srj.onlineshopping.model.Category;

public interface CategoryService {

	List<Category> list();

	Category get(int id);
}
