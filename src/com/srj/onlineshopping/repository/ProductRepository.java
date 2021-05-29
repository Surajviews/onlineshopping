package com.srj.onlineshopping.repository;

import java.util.List;

import com.srj.onlineshopping.model.Product;

public interface ProductRepository {

	Product get(int productId);
	List<Product> list();
	boolean add(Product product);
	boolean update(Product product);
	boolean delete(Product product);
	
	//Bussiness methods
	List<Product> listActiveProduct();
	List<Product> listActiveProductByCategory(int id);
	List<Product> getLetestActiveProducts(int count);
	
}
