package com.example.cartProduct;

import com.example.cartProduct.domain.Cart;
import com.example.cartProduct.repository.ICartRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class CartProductApplication implements CommandLineRunner {
    @Autowired
    ICartRepository cartRepository;

    public static void main(String[] args) {
        SpringApplication.run(CartProductApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
		List<Cart> cartList = cartRepository.findOneByIdEntityGraph(Arrays.asList(1,2));
		cartList.stream().forEach(cart1 -> {
			System.out.println(cart1.toString());
			cart1.getProductList().stream().forEach(System.out::println);
		});
    }
}
