package com.tickek.infrastructure.repositories;

import org.springframework.data.repository.CrudRepository;

import com.tickek.domain.model.Product;

public interface ProductRepository 
extends CrudRepository<Product, Long> {
}
