package com.codegym.service.impl;

import com.codegym.model.Product;
import com.codegym.repository.Impl.ProductRepositoryImpl;
import com.codegym.service.ProductService;

import java.util.List;

public class ProductServiceImpl implements ProductService {

    ProductRepositoryImpl productRepository = new ProductRepositoryImpl();

    @Override
    public List<Product> findAll() {
        return productRepository.findAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);
    }
}
