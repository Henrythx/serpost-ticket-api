package com.tickek.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tickek.entities.Product;

public interface ProductRepository 
extends CrudRepository<Product, Long> {
}
