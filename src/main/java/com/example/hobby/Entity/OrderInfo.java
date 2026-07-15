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
// @Table(name = "order_info") 今の環境だと不要
@Getter
@Setter
@NoArgsConstructor
public class OrderInfo implements Serializable {

    @Id
    @Column(name = "order_id")
    private String orderId;

    @Column(name = "member_code")
    private String memberCode;

    @Column(name = "order_date")
    private LocalDate orderDate;
    
    @Column(name = "shipping_date")
    private LocalDate shippingDate;

    @Column(name = "status")
    private String status;

    @Column(name = "total_price")
    private int totalPrice;

    
}
