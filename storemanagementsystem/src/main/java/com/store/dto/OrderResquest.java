package com.store.dto;

import java.util.List;

import com.store.entity.Customer;
import com.store.entity.Product;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString


public class OrderResquest {
	
	private Customer customer;
	

}
