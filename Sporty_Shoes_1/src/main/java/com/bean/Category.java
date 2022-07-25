package com.bean;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity(name="category")
public class Category {
    @Id
	private int id;
	private String type;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", type=" + type + "]";
	}
	public Category(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}
	public Category() {
		super();
	}
	
	
	
}
