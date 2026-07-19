package com.example.hobby.Entity;

import java.io.Serializable;

import org.seasar.doma.Column;
import org.seasar.doma.Id;
import org.seasar.doma.Entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
// @Table(name = "member") 今の環境だと不要
@Getter
@Setter
@NoArgsConstructor
public class Cart implements Serializable {

    @Id
    @Column(name = "cart_id")
    private int cartId;

    @Column(name = "member_code")
    private String memberCode;

    @Column(name = "product_id")
    private String productId;

    @Column(name = "price")
    private int price;

    @Column(name = "quantity")
    private int quantity;

}
