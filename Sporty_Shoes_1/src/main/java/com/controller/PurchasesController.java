package com.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.Service.PurchaseService;
import com.bean.Purchase;

@Controller
public class PurchasesController {

	@Autowired
	PurchaseService ps;
	
	
	@RequestMapping(value="show_Purchases")
	public String showPurchases(HttpServletRequest req) {
		
		
		List<Purchase> listis = ps.getPurchases();
		System.out.println(listis);
		req.setAttribute("listis", listis);
		
        if(req.getAttribute("list")==null) {
        	List<Purchase> list = ps.getPurchases();
    		System.out.println(list);
    		req.setAttribute("Purchase", list);
        }else {
        	req.setAttribute("Purchase", req.getAttribute("lista"));
        }
		
		return "display_Purchases";
	}
	
	
	@RequestMapping(value="/Purchases",method=RequestMethod.POST)
	public String Purchases(HttpServletRequest req) {
		
		String Date = req.getParameter("Date").toString();
		String category = req.getParameter("category").toString();
		String value="idk";
		String dupD = Date;
		
		if(dupD==value) {
			System.out.println("It might not be trash");
		}
		
		if(category=="idk") {
			System.out.println("Your code might not be trash");
		}
		
		System.out.println("the value of Date is: "+Date);
		System.out.println("The value of category is: '"+category+"'");
		if(category!="idk") {
			System.out.println("Your code is trash");
		}
		
		if("idk"=="idk") {
			System.out.println("I'm trash");
		}
		
		
			List<Purchase> list = ps.getPurchaseReportByCategoryAndDate(category, Date);
			req.setAttribute("Purchase", list);
			System.out.println(list);
			System.out.println(" It is I the wrong method");
		
		System.out.println("Check in the purchase method");
		
		List<Purchase> listis = ps.getPurchases();
		System.out.println(listis);
		req.setAttribute("listis", listis);
		
       	return "display_Purchases";
		
		
		
		
	}
	
//	
//	@RequestMapping(value="/Category",method=RequestMethod.POST)
//	public String trya(HttpServletRequest req) {
//		
//		String category = req.getParameter("category").toString();
//        
//		
//		
//	}
	
	
	
	
	
	
	
}
