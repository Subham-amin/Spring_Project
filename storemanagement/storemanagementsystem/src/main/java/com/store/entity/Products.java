package com.store.entity;

public class Products {
	
	private int id;
	private String productName;
	private double productPrice;
	public Products(int id, String productName, double productPrice) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
	}
	public Products() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	@Override
	public String toString() {
		return "Products [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice + "]";
	}

}
