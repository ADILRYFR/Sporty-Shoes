package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Purchase {
	
	@Id
	private int purchase_id;
	private int Product_id;
	private String Purchase_Date;
	private String p_category;
    private long p_price;	
	
	public long getP_price() {
		return p_price;
	}
	public void setP_price(long p_price) {
		this.p_price = p_price;
	}
	public int getPurchase_id() {
		return purchase_id;
	}
	public void setPurchase_id(int purchase_id) {
		this.purchase_id = purchase_id;
	}
	public int getProduct_id() {
		return Product_id;
	}
	public void setProduct_id(int product_id) {
		Product_id = product_id;
	}
	public String getPurchase_Date() {
		return Purchase_Date;
	}
	public void setPurchase_Date(String purchase_Date) {
		Purchase_Date = purchase_Date;
	}
	public String getP_category() {
		return p_category;
	}
	public void setP_category(String p_category) {
		this.p_category = p_category;
	}
	@Override
	public String toString() {
		return "Purchase [purchase_id=" + purchase_id + ", Product_id=" + Product_id + ", Purchase_Date="
				+ Purchase_Date + ", p_category=" + p_category + ", p_price=" + p_price + "]";
	}
	
	
	

}
