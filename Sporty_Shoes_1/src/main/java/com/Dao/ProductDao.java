package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Product;
@Repository
public class ProductDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	
	public List<Product> getProducts(String Category){
		
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("select e from product e where e.p_category=?1");
		qry.setParameter(1, Category);
		List<Product> list = qry.getResultList();
		System.out.println(list+"\n Dao");
		System.out.println("Check Dao");
		return list;
		
	}
	
	public List<Product> showCategories(){
		
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("select e from product e");
		
		List<Product> list = (List<Product>)qry.getResultList();
		//System.out.println(list);
		return list;
		
		
	}

	
	
}
