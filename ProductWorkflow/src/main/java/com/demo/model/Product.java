package com.demo.model;

public class Product 
{
	private int product_id;
	private String product_name;
	private String product_colour;
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(int product_id, String product_name, String product_colour) {
		super();
		this.product_id = product_id;
		this.product_name = product_name;
		this.product_colour = product_colour;
	}
	public int getProduct_id() {
		return product_id;
	}
	public void setProduct_id(int product_id) {
		this.product_id = product_id;
	}
	public String getProduct_name() {
		return product_name;
	}
	public void setProduct_name(String product_name) {
		this.product_name = product_name;
	}
	public String getProduct_colour() {
		return product_colour;
	}
	public void setProduct_colour(String product_colour) {
		this.product_colour = product_colour;
	}
	@Override
	public String toString() {
		return "Product [product_id=" + product_id + ", product_name=" + product_name + ", product_colour="
				+ product_colour + "]";
	}
	
	
	
	
	

}
