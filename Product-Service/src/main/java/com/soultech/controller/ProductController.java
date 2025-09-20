package com.soultech.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ProductController {

    @PostMapping("/add/product")
    public void createProduct()
    {
    }

    @GetMapping("/products")
    public String products()
    {
        return "<h1>List of products</h1>";
    }


    @GetMapping("/product/{id}")
    public String product(@PathVariable("id") long id)
    {
        return "<h1> This is a single product" + id +  "</h1>";
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
