package com.srj.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.srj.onlineshopping.model.Category;
import com.srj.onlineshopping.repository.CategoryRepository;

@Transactional
@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Category> list() {

		return categoryRepository.list();
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		return categoryRepository.get(id);
	}

	@Override
	@Transactional
	public boolean add(Category category) {

		/* return categoryRepository.add(category); */
		return categoryRepository.add(category);
	}

	@Override
	public boolean update(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.update(category);
	}

	@Override
	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return categoryRepository.delete(category);
	}

}
