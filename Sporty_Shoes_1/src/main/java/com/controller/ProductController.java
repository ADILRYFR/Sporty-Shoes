package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Service.ProductService;
import com.Service.UserService;
import com.bean.Product;
import com.bean.User;

@Controller
public class ProductController {

	@Autowired
	ProductService ps;
	
	
	
	@RequestMapping(value="/show_categories")
	public String category(HttpServletRequest req) {
		
		List<Product> list= ps.getCategory();
		req.setAttribute("lit", list);
		
		return "Category";
		
	}
	
	
	@RequestMapping(value="/getProducts",method= RequestMethod.POST)
	public String Products(HttpServletRequest req) {
		
		String category = req.getParameter("category");
		List<Product> listof = ps.getProduct(category);
		req.setAttribute("produt",listof);
		System.out.println(listof+"\n Controller");
		System.out.println("Check controller");
		
		return "display_Products";
	}
	
	
	
	
	
	
}
