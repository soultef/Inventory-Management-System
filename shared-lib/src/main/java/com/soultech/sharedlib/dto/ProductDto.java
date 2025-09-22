package com.soultech.sharedlib.dto;

import jakarta.validation.constraints.NotBlank;

import java.math.BigDecimal;

public class ProductDto {


    @NotBlank(message = "Product name should have a name")
    private String name;

    @NotBlank(message = "Product should have description")
    private String description;
    private BigDecimal price;

    public ProductDto() {

    }

    public ProductDto(String name, String description, BigDecimal price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
