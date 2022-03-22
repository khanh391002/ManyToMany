package com.example.cartProduct.service;

import com.example.cartProduct.repository.ICartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService implements ICartService{
    @Autowired
    private ICartRepository cartRepository;
}
