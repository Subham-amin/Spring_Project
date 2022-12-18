package com.store.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.store.dto.OrderResponse;
import com.store.dto.OrderResquest;
import com.store.entity.Customer;
import com.store.repository.CustomerRepository;
import com.store.repository.ProductRepository;

@RestController
public class OrderController {
	
	@Autowired
	private CustomerRepository customerRepository;
	@Autowired
	private ProductRepository productRepository;
	@PostMapping("/placeOrder")
	public Customer placeOrder(@RequestBody OrderResquest request) {
		return customerRepository.save(request.getCustomer());	
	}
	@GetMapping("/findAllOrders")
	public List<Customer> findAllOrders(){
		
		return customerRepository.findAll();
	
	}
	@GetMapping("/getInfo")
	public List<OrderResponse> getJoinformation(){
		
		return customerRepository.getJoinInformation();
	
	}
}
