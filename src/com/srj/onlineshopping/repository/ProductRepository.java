package com.srj.onlineshopping.repository;

import java.util.List;

import com.srj.onlineshopping.model.Product;

public interface ProductRepository {

	Product get(Long productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//Bussiness methods
	List<Product> listActiveProduct();
	List<Product> listActiveProductByCategory(Long categoryId);
	List<Product> getLetestActiveProducts(Long count);
	
}
