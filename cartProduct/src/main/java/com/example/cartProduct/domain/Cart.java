package com.example.cartProduct.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "cart")
public class Cart {
    @Id
    @Column(name = "cart_name")
    String cartName;
    @Column(name = "id_cart")
    int idCart;

    @ManyToMany(fetch = FetchType.LAZY, mappedBy = "cartList")
    List<Product> productList = new ArrayList<>();

    public Cart() {
    }

    public Cart(String cartName, int idCart) {
        this.cartName = cartName;
        this.idCart = idCart;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public int getIdCart() {
        return idCart;
    }

    public void setIdCart(int idCart) {
        this.idCart = idCart;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartName='" + cartName + '\'' +
                ", idCart=" + idCart +
                '}';
    }
}
