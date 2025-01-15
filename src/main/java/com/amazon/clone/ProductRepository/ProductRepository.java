package com.amazon.clone.ProductRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.amazon.clone.Product.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
