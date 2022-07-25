package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.UserDao;
import com.bean.User;

@Service
public class UserService {
	
	@Autowired
	UserDao ud;
	
	
	public String createUser(User u) {
		
		if(ud.createUser(u)==1) {
			return "User Account created";
		}else {
			return "User Account was not created";
		}
		
	}
	
	public boolean checkUser(User u) {
		if(ud.checkUser(u)==1) {
			return true;
		}else {
			return false;
			
		}
	}

    public String createAdmin(User u) {
    	
    	
		if(ud.createAdmin(u)==1) {
			return "User Account created";
		}else {
			return "User Account was not created";
		}
		
	
    }

    public boolean checkAdmin(User u) {
    	
    	if(ud.checkAdmin(u)==1) {
			return true;
		}else {
			return false;
			
		}
    	
    }

    public List<User> getUsers(){
    	return ud.getUsers();
    }
    
}
