package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import com.tickek.domain.model.Product;

public interface ProductService {
    List<Product> findAll();
    
    Optional<Product> findById(Long id);

    Product save(Product product);
    
    Product update(Product product);
    
    Product patch(Product product);

    Product delete(Long id);
}
