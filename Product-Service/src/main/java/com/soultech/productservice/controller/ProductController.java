package com.soultech.productservice.controller;

import com.soultech.sharedlib.dto.ProductDto;
import com.soultech.productservice.service.ProductService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    private final ProductService productService;

    public  ProductController(ProductService productService)
    {
        this.productService = productService;
    }

    @PostMapping("/add/product")
    public ResponseEntity<String> createProduct(@RequestBody ProductDto productDto)
    {
        return ResponseEntity.ok(productDto.toString() + " success message");
    }

    @GetMapping("/products")
    public String products()
    {
        return "<h1>List of products</h1>";
    }


    @GetMapping("/product/{id}")
    public ResponseEntity<ProductDto> getProduct(@PathVariable("id") Long id) {
        ProductDto product = productService.getProductById(id); // May throw ProductNotFoundException
        return ResponseEntity.ok(product);
    }

    @PutMapping("/update/{id}")
    public String updateProduct(@PathVariable("id") long id)
    {
        return "<h1>This is the update product </h1>";
    }

    @DeleteMapping("/delete/{id}")
    public String deleteProduct(@PathVariable("id") Long id)
    {
        return "<h1> This is the delete page </h1>";
    }



}
