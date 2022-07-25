package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.Purchase;

@Repository
public class PurchaseDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	
	public List<Purchase> getPurchaseReportByCategory(String category){
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("select p from Purchase p where p.p_category=?1");
		qry.setParameter(1, category);
		List<Purchase> list = qry.getResultList();
		return list;
		
		
	}
	
	
	
	
	public List<Purchase> getPurchaseReportByDate(String Date){
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("select p from Purchase p where p.Purchase_Date=?1");
		qry.setParameter(1, Date);
		List<Purchase> list = qry.getResultList();
		return list;
		
		
	}
	
	
	
	
	public List<Purchase> getPurchaseReportByCategoryAndDate(String category,String Date){
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("select p from Purchase p where p.p_category=?1 and p.Purchase_Date=?2");
		qry.setParameter(1, category);
		qry.setParameter(2, Date);
		List<Purchase> list = qry.getResultList();
		return list;
		}
	
	public List<Purchase> getCategory(){
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("select p.p_category from Purchase p ");
        List<Purchase> list = qry.getResultList();
        return list;
	}
	
	
	public List<Purchase> getDate(){
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("select p.Purchase_Date from Purchase p ");
        List<Purchase> list = qry.getResultList();
        return list;
	}
	
	
	public List<Purchase> getPurchases(){
		EntityManager em = emf.createEntityManager();
		Query qry = em.createQuery("select p from Purchase p ");
        List<Purchase> list = qry.getResultList();
        return list;
	}
	

}
