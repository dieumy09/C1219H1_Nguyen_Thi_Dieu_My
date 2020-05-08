package com.codegym.cart.service;


import com.codegym.cart.model.Product;

public interface ProductService {
    Iterable<Product> findAll();

    Product findById(Long id);

    void save(Product product);

    void remove(Long id);
}
