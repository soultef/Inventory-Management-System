package com.soultech.productservice.mapper;

import com.soultech.sharedlib.dto.ProductDto;
import com.soultech.productservice.entity.ProductEntity;

public class ProductMapper {

    public static ProductDto toDto(ProductEntity entity) {
        if (entity == null) return null;

       return new ProductDto(entity.getName(), entity.getDescription(), entity.getPrice());
    }

    public static ProductEntity toEntity(ProductDto dto) {
        if (dto == null) return null;

        ProductEntity entity = new ProductEntity();
        entity.setName(dto.getName());
        entity.setPrice(dto.getPrice());
        return entity;
    }
}

