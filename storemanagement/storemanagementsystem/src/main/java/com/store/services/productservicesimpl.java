package com.store.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.store.entity.Products;
@Service
public class productservicesimpl implements productservices {

	List<Products> list;
	public productservicesimpl() {
		list=new ArrayList<>();
		list.add(new Products(101,"SOAP",250.00));
		list.add(new Products(102,"TV",45000.00));
		list.add(new Products(103,"OVEN",5000.00));
		list.add(new Products(104,"CHOCOLATE",50.00));
	}
	
	@Override
	public List<Products> getProducts() {
		// TODO Auto-generated method stub
		return list;
	}

	@Override
	public Products getProduct(int productId) {
		// TODO Auto-generated method stub
		Products c=null;
		for(Products products:list)
		{
			if (products.getId()==productId) {
				c=products;
				break;
			}
		}
			return c;
	}

	@Override
	public Products addProduct(Products product) {
		// TODO Auto-generated method stub
		list.add(product);
		return product;
	}

	@Override
	public Products updateProduct(Products product) {
		// TODO Auto-generated method stub
		list.forEach(e ->{
			if(e.getId()== product.getId()){
				e.setProductName(product.getProductName());
				e.setProductPrice(product.getProductPrice());
				}
			}
		);
			return product;
			}
	@Override
	public Products deleteProduct(int productId) {
		// TODO Auto-generated method stub
		list=this.list.stream().filter(e->e.getId()!= productId).collect(Collectors.toList());
			System.out.println("Product Deleted");
		return null;	
	}
}