package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="product")
public class Product {
	
	public Product() {
		super();
		System.out.println("This is also being called brh");
		// TODO Auto-generated constructor stub
	}
	@Id
	private int p_id;
	private String p_name;
	private String p_category;
	private int Purchase_id;
	private float p_price;
	
	public Product(int p_id, String p_name, String p_category, int purchase_id, float p_price) {
		super();
		this.p_id = p_id;
		this.p_name = p_name;
		this.p_category = p_category;
		Purchase_id = purchase_id;
		this.p_price = p_price;
	}
	public int getP_id() {
		return p_id;
	}
	public void setP_id(int p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_category() {
		return p_category;
	}
	public void setP_category(String p_category) {
		this.p_category = p_category;
	}
	public int getPurchase_id() {
		return Purchase_id;
	}
	public void setPurchase_id(int purchase_id) {
		Purchase_id = purchase_id;
	}
	public float getP_price() {
		return p_price;
	}
	public void setP_price(float p_price) {
		this.p_price = p_price;
	}
	@Override
	public String toString() {
		return "Product [p_id=" + p_id + ", p_name=" + p_name + ", p_category=" + p_category + ", Purchase_id="
				+ Purchase_id + ", p_price=" + p_price + "]";
	}

	

}
