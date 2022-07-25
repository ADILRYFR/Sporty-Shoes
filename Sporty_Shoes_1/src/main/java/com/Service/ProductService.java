package com.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Dao.ProductDao;
import com.bean.Product;

@Service
public class ProductService {
	
	@Autowired
	ProductDao pd;
	
	
	public List<Product> getProduct(String Category){
//	    System.out.println("Check service");
//	    System.out.println(pd.getProducts(Category+ "\n Service"));
		
		
		
		
		return pd.getProducts(Category);	
	}
	
	public List<Product> getCategory(){
		//System.out.println(pd.showCategories()+"Check over here(Service method)");
		return pd.showCategories();
	}

}
