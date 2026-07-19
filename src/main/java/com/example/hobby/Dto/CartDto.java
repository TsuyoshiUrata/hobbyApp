package com.example.hobby.Dto;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CartDto {
    private int CartId;
    private String MemberCode;
    private String ProductId;
    private int price;
    private int quantity;
}
