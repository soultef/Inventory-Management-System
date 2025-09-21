package com.soultech.service;

import org.springframework.stereotype.Service;

@Service
public class ProductService {

    public String getProduct(Long id)
    {
        return "This is product service";
    }


    public String getProducts()
    {
        return "<h1>This is product service </h1>";
    }


}
