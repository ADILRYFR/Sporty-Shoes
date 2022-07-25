package com.Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bean.User;

@Repository
public class UserDao {
	
	@Autowired
	EntityManagerFactory emf;
	
	
	
	public int createUser(User u) {
		
		try {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tran = em.getTransaction();
	    tran.begin();
	    em.persist(u);
	    tran.commit();
	    return 1;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			return 0;
		}
		
	}
	
	
	public int checkUser(User u) {
		
		EntityManager em = emf.createEntityManager();
//		User u1 = em.find(User.class, u.getUser_username());
//		User u2 = em.find(User.class, u.getUser_password());
		Query qry = em.createQuery("select u from User u where u.user_username=:username and u.user_password=:password");
		qry.setParameter("username",u.getUser_username());
		qry.setParameter("password",u.getUser_password());
		List<User> list = qry.getResultList();
		
		
		if(list.size()!=0) {
			return 1;
		}else {
			return 0;
		}
		
	}

	public int createAdmin(User u) {
		
		try {
		EntityManager em = emf.createEntityManager();
		EntityTransaction tran = em.getTransaction();
	    tran.begin();
	    em.persist(u);
	    tran.commit();
	    return 1;
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
			return 0;
		}
		
	}
		
	public int checkAdmin(User u) {
		
		EntityManager em = emf.createEntityManager();
//		User u1 = em.find(User.class, u.getUser_username());
//		User u2 = em.find(User.class, u.getUser_password());
		Query qry = em.createQuery("select u from User u where u.user_username=:username and u.user_password=:password and u.user_type=:type");
		qry.setParameter("username",u.getUser_username());
		qry.setParameter("password",u.getUser_password());
		qry.setParameter("type", u.getUser_type());
		List<User> list = qry.getResultList();
		
		if(list.size()!=0) {
			return 1;
		}else {
			return 0;
		}
		
	
	}
 
    public List<User> getUsers(){
    	EntityManager em = emf.createEntityManager();
    	Query qry = em.createQuery("select u from User u where u.user_type =?1 ");
    	qry.setParameter(1, "user");
    	List<User> list = qry.getResultList();
    	return list;
    }
	
	
}
