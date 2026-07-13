package com.example.hobby.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
    private String productId;
    private int categoryId;
    private String productName;
    private String manufacturer;
    private int price;
    private LocalDate releaseDate;
    private LocalDate orderDeadline;
    private int stock;
    private String description;
    private String categoryName;
}
