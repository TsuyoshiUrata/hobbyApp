package com.example.hobby.Service;

import java.util.List;

import com.example.hobby.Dto.ProductDto;


public interface ProductService {
    public List<ProductDto> productList();
    
    public ProductDto productDetail(String productId);

    public List<ProductDto> searchProductList(String productName);
}
