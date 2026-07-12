package com.example.hobby.Entity;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

import lombok.NoArgsConstructor;

import org.seasar.doma.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.Id;

@Entity
// @Table(name = "member") 今の環境だと不要
@Getter
@Setter
@NoArgsConstructor
public class Product implements Serializable {

    @Id
    @Column(name = "product_id")
    private String productId;

    @Column(name = "category_id")
    private String categoryId;

    @Column(name = "category_name")
    private String categoryName;

    @Column(name = "manufacturer")
    private String manufacturer;

    @Column(name = "price")
    private int price;

    @Column(name = "release_date")
    private LocalDate releaseDate;

    @Column(name = "order_deadline")
    private LocalDate orderDeadline;

    @Column(name = "stock")
    private int stock;

    @Column(name = "description")
    private String description;
}
