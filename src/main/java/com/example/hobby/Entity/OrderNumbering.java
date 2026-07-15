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
public class OrderNumbering implements Serializable {

    @Id
    @Column(name = "order_number")
    private String orderNumber;


}
