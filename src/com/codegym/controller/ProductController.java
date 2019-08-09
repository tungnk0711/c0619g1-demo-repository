package com.codegym.controller;

import com.codegym.model.Product;
import com.codegym.service.impl.ProductServiceImpl;

import java.util.List;

public class ProductController {

    ProductServiceImpl productService = new ProductServiceImpl();

    public List<Product> findAll() {
        return productService.findAll();
    }

    public void addProduct(Product product) {
        productService.add(product);
    }
}
