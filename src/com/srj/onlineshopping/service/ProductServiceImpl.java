package com.srj.onlineshopping.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.srj.onlineshopping.model.Product;
import com.srj.onlineshopping.repository.ProductRepository;

@Service
@Transactional
public class ProductServiceImpl implements ProductService {

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public Product get(int productId) {
		// TODO Auto-generated method stub
		return productRepository.get(productId);
	}

	@Override
	public List<Product> list() {
		// TODO Auto-generated method stub
		return productRepository.list();
	}

	@Override
	public boolean add(Product product) {
		// TODO Auto-generated method stub
		return productRepository.add(product);
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return productRepository.update(product);
	}

	@Override
	public boolean delete(Product product) {
		// TODO Auto-generated method stub
		return productRepository.delete(product);
	}

	@Override
	public List<Product> listActiveProduct() {
		// TODO Auto-generated method stub
				return productRepository.listActiveProduct();
	}

	@Override
	public List<Product> listActiveProductByCategory(int id) {
		// TODO Auto-generated method stub
		return productRepository.listActiveProductByCategory(id);
	}

	@Override
	public List<Product> getLetestActiveProducts(int count) {
		// TODO Auto-generated method stub
		return productRepository.getLetestActiveProducts(count);
	}

}
