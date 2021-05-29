package com.srj.onlineshopping.repository;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.srj.onlineshopping.model.Category;

@Transactional
@Repository
public class CategoryRepositoryImpl implements CategoryRepository {

	@Autowired
	 SessionFactory sessionFactory;
	
	
	
	@Override
	public List<Category> list() {
		
		String selectActiveCategory="FROM category WHERE active=:active";
		Query query=sessionFactory.getCurrentSession().createQuery(selectActiveCategory);
		
		query.setParameter("active", true);
		return query.getResultList();
		
		//"FROM category WHERE userEmail='"+is_active+"'";
	}



	@Override
	public Category get(Long id) {
		
		return sessionFactory.getCurrentSession().get(Category.class, Long.valueOf(id));
	}



	@Override
	@Transactional
	public boolean add(Category category) {
		
		try{
			sessionFactory.getCurrentSession().save(category);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}



	@Override
	public boolean update(Category category) {
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}



	@Override
	public boolean delete(Category category) {
		
		category.setActive(false);
		try{
			sessionFactory.getCurrentSession().update(category);
			return true;
		}catch (Exception e) {
			e.printStackTrace();
			return false;
		}
		
	}



	

}
