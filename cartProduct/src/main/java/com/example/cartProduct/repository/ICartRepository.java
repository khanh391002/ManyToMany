package com.example.cartProduct.repository;

import com.example.cartProduct.domain.Cart;
import com.example.cartProduct.domain.Product;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ICartRepository extends JpaRepository<Product,String> {
    @EntityGraph(attributePaths = {"productList"})
    @Query("SELECT p FROM Product p WHERE p.id IN (:ids)")
    List<Cart> findOneByIdEntityGraph(@Param("ids") List ids);
}
