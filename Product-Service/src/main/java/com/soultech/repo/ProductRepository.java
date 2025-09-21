package com.soultech.repo;

import com.soultech.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ProductRepository extends JpaRepository<ProductEntity, Long> {
}