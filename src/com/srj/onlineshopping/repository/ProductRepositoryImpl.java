package com.srj.onlineshopping.repository;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srj.onlineshopping.model.Product;

@Repository
@Transactional
public class ProductRepositoryImpl implements ProductRepository {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public Product get(int id) {

		try {
			return sessionFactory.getCurrentSession().get(Product.class, Integer.valueOf(id));
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Product> list() {

		return sessionFactory.getCurrentSession().createQuery("FROM product", Product.class).getResultList();
	}

	@Override
	public boolean add(Product product) {

		try {
			// here we used persist becoz we are gone add new product not gone
			// saved an existing product
			sessionFactory.getCurrentSession().persist(product);
			return true;
		} catch (Exception ex) {

			ex.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean update(Product product) {
		try {
			sessionFactory.getCurrentSession().update(product);
			return true;
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Product product) {

		try {
			product.setActive(false);
			// call the update method
			return this.update(product);
		} 
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return false;
	}

	@Override
	public List<Product> listActiveProduct() {
		
		String selectActiveProducts = "FROM product WHERE active=:active";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveProducts,Product.class)
						.setParameter("active", true)
							.getResultList();
	}

	@Override
	public List<Product> listActiveProductByCategory(int categoryId) {

		String selectActiveProductsByCategory = "FROM product WHERE active=:active AND categoryId=:categoryId";
		return sessionFactory
				.getCurrentSession()
					.createQuery(selectActiveProductsByCategory,Product.class)
						.setParameter("active", true)
							.setParameter("categoryId", categoryId)
								.getResultList();
	}

	@Override
	public List<Product> getLetestActiveProducts(int count) {
		
		return sessionFactory
				.getCurrentSession()
					.createQuery("FROM product WHERE active =: active ORDER BY id",Product.class)
						.setParameter("active", true)
						.setFirstResult(0)
						.setMaxResults(count)		
								.getResultList();
	}

	

}
