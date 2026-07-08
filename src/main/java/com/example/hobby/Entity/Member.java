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
//@Table(name = "member") 今の環境だと不要
@Getter
@Setter
@NoArgsConstructor
public class Member implements Serializable{

    @Id
    @Column(name = "member_code")
    private String memberCode;

    @Column(name = "member_name")
    private String memberName;

    @Column(name = "member_mail")
    private String memberMail;

    @Column(name = "phone_number")
    private String memberPhone;

    @Column(name = "postal_code")
    private String memberPost;

    @Column(name = "address")
    private String memberAddress;

    @Column(name = "birth_date")
    private LocalDate memberBirth;

    @Column(name = "join_date")
    private LocalDate memberJoin;

    @Column(name = "member_rank")
    private int memberRank;

    @Column(name = "member_role")
    private String memberRole;

    @Column(name = "password")
    private String memberPass;
}
