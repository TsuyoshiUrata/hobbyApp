package com.example.hobby.Entity;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;

import lombok.NoArgsConstructor;


import org.seasar.doma.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.Id;

@Entity
//@Table(name = "memberNumbering") 今の環境だと不要
@Getter
@Setter
@NoArgsConstructor
public class MemberNumbering implements Serializable{

    @Id
    @Column(name = "member_number")
    private int memberNumbering;

    
}
