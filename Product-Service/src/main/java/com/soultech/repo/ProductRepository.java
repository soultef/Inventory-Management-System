package com.soultech.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.soultech.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}