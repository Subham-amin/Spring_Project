package com.store.services;

import java.util.List;

import com.store.entity.Products;

public interface productservices {

	public List<Products> getProducts();
	public Products getProduct(int productId);
	public Products addProduct(Products product);
	public Products updateProduct(Products product);
	public Products deleteProduct(int productId);
}
