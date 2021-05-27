package com.srj.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.srj.onlineshopping.model.Category;
import com.srj.onlineshopping.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;
	
	
	@Override
	public List<Category> list() {
		
		return categoryRepository.list();
	}


	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.get(id);
	}

}
