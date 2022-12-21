package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.entity.Products;
import com.store.services.productservices;

@RestController //Representational State Transfer.
public class controller {
	@Autowired
	private productservices ProductServices;
	//get products
	@GetMapping("/products")//show all /products
	public List<Products> getProducts(){
		
		return this.ProductServices.getProducts();
	}
	@GetMapping("/products/{productId}")// show Product by id
	public Products getProduct(@PathVariable int productId) {
		return this.ProductServices.getProduct(productId);
	}
	@PostMapping("/products")
	public Products addProduct(@RequestBody Products product) {
		return this.ProductServices.addProduct(product);
	}
	@PutMapping("/products")//update product
	public Products updateCourse(@RequestBody Products products) {
		return this.ProductServices.updateProduct(products);
	}
	@DeleteMapping("/products/{productId}")
	public Products deleteProduct(@PathVariable int productId) {
		return this.ProductServices.deleteProduct(productId);
	}
}