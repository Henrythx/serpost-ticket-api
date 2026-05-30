package com.tickek.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.tickek.domain.model.Product;
import com.tickek.infrastructure.repositories.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

    @Autowired
    private ProductRepository productRepository;

    @Transactional(readOnly = true)
    @Override
    public List<Product> findAll() {
        return (List<Product>) productRepository.findAll();
    }
    
    
    
    @Transactional(readOnly = true)
    @Override
    public Optional<Product> findById(Long id) {
        return productRepository.findById(id);
    }
    
    
    
    @Transactional
    @Override
    public Product save(Product product) {
        return productRepository.save(product);
    }
    
    
    
    @Transactional
    @Override
    public Product update(Product product) {
        return productRepository.save(product);
    }
    
    
    
    @Transactional
    @Override
    public Product patch(Product product) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'patch'");
    } 



    @Transactional
    @Override
    public Product delete(Long id) {
        Optional<Product> product = productRepository.findById(id);
        product.ifPresent(productRepository::delete);
        return product.orElse(null);
    }   
}
