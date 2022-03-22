package com.example.cartProduct.service;

import com.example.cartProduct.repository.ICartRepository;
import com.example.cartProduct.repository.IProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductService implements  IProductService{
    @Autowired
    private IProductRepository productRepository;
}
