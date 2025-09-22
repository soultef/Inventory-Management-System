package com.soultech.productservice.service;

import com.soultech.sharedlib.dto.ProductDto;
import com.soultech.productservice.exception.ProductNotFoundException;
import com.soultech.productservice.mapper.ProductMapper;
import com.soultech.productservice.repo.ProductRepository;
import org.springframework.stereotype.Service;



@Service
public class ProductService {

    private final ProductRepository productRepository;

    public ProductService(ProductRepository productRepository)
    {
        this.productRepository = productRepository;

    }

    public ProductDto createProduct(ProductDto productDto)
    {

    }

    public ProductDto getProductById(Long id) {
        return productRepository.findById(id)
                .map(ProductMapper::toDto)
                .orElseThrow(() -> new ProductNotFoundException(id));
    }

    public String getProducts()
    {
        return "<h1>This is product service </h1>";
    }


}
