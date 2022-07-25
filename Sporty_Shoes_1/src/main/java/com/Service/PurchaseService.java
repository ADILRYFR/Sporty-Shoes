package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.PurchaseDao;
import com.bean.Purchase;

@Service
public class PurchaseService {
	
	
	@Autowired
	PurchaseDao dp;
	
	public List<Purchase> getPurchaseReportByCategory(String category){
		return dp.getPurchaseReportByCategory(category);
	}
	
	
	
	public List<Purchase> getPurchaseReportByDate(String Date){
		return dp.getPurchaseReportByDate(Date);
	}
	
	
	
	public List<Purchase> getPurchaseReportByCategoryAndDate(String category,String Date){
		
		return dp.getPurchaseReportByCategoryAndDate(category, Date);
	}

	
	public List<Purchase> getPurchases(){
		return dp.getPurchases();
	}
	
}
