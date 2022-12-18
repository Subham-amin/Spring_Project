package com.store.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.store.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Integer> {

}
