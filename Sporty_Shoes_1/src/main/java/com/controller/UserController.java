package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Service.UserService;
import com.bean.User;

@Controller
public class UserController {

	
	@Autowired
	UserService us;
	
	
    @RequestMapping(value="/show_Users")
    public String showUser(HttpServletRequest req) {
    	System.out.println("check over here");
    	List<User> list = us.getUsers();
    	System.out.println("CHeck again ");
    	req.setAttribute("lut",list);
    	System.out.println("THen how about this?");
    	return "display-Users";
    }
	
    
    @RequestMapping(value="/adminhomepage")
    public String adminpage() {
    	return "adminHomePage";
    }
    
    
	@RequestMapping(value="/adminlogin")
	public String adminlogin() {
		return "adminlogin";
	}
	
	@RequestMapping(value="/adminsignin")
	public String adminsignin() {
		return "adminSignin";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	

	@RequestMapping(value="/Signin")
	public String Signin() {
		return "signin";
	}
	
	@RequestMapping(value="/createUser",method = RequestMethod.POST)
	public String createUser(HttpServletRequest req) {
		
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		
		
		User u = new User();
		
		u.setUser_username(username);
		u.setUser_password(password);
	    u.setUser_type("user");
	    System.out.println(u);
		String result=us.createUser(u);
		req.setAttribute("user",username);
		return "HomePage";
			
	}
	
	@RequestMapping(value="/checkUser",method=RequestMethod.POST)
	public String checkUser(HttpServletRequest req) {
		
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		
        User u = new User();
		
		u.setUser_username(username);
		u.setUser_password(password);
		
		if(us.checkUser(u)) {
			req.setAttribute("user", username);
			return "HomePage";
		}else {
			req.setAttribute("user", "Incorrect credentials or no account created");
			return "index";
		}
		
	}
	
	@RequestMapping(value="/createAdmin",method = RequestMethod.POST)
	public String createAdmin(HttpServletRequest req) {
		
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		String type = req.getParameter("type");
		
		User u = new User();
		
		u.setUser_username(username);
		u.setUser_password(password);
	    u.setUser_type("admin");
	    System.out.println(u);
		String result=us.createUser(u);
		req.setAttribute("user",username);
		return "HomePage";
	}
	
	@RequestMapping(value="/checkAdmin",method=RequestMethod.POST)
	public String checkAdmin(HttpServletRequest req) {
		
		String username = req.getParameter("name");
		String password = req.getParameter("password");
		
        User u = new User();
		
		u.setUser_username(username);
		u.setUser_password(password);
		u.setUser_type("admin");
		if(us.checkAdmin(u)) {
			req.setAttribute("user", username);
			return "adminHomePage";
		}else {
			req.setAttribute("user", "Incorrect credentials or no account created");
			return "index";
		}
		
	}
	
	
}
