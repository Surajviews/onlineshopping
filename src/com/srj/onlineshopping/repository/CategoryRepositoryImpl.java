package com.srj.onlineshopping.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.srj.onlineshopping.model.Category;

@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

	private static  List<Category> categories=new ArrayList<>();
	
	static{
		
		Category category=new Category();
		category.setId(1);
		category.setName("Television");
		category.setDescription("Television Description");
		category.setImageURL("CAT_1.png");
		
		categories.add(category);
		
		category=new Category();
		category.setId(2);
		category.setName("Mobile");
		category.setDescription("Mobile Description");
		category.setImageURL("CAT_2.png");
		
		categories.add(category);
		
		category=new Category();
		category.setId(3);
		category.setName("Laptop");
		category.setDescription("Laptop Description");
		category.setImageURL("CAT_3.png");
		
		categories.add(category);
	}
	
	
	
	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}



	@Override
	public Category get(int id) {
		
		for(Category category:categories){
			if(category.getId()==id)  return category;
		}
		return null;
	}

}
