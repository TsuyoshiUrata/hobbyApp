package com.example.hobby.Dto;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MemberDto {
    private String MemberCode;
    private String MemberName;
    private String MemberMail;
    private String MemberPhone;
    private String MemberPost;
    private String MemberAddress;
    private LocalDate MemberBirth;
    private LocalDate MemberJoin;
    private String MemberRank;
    private String MemberRole;
    private String MemberPass;

    
    public void setMemberRank(int num) {
    if (num < 10) {
        this.MemberRank = "ブロンズランク";
    } else if (num < 30) {
        this.MemberRank = "シルバーランク";
    } else if (num < 50) {
        this.MemberRank = "ゴールドランク";
    } else if (num < 100) {
        this.MemberRank = "ダイヤモンドランク";
    } else {
        this.MemberRank = "プラチナランク";
    }
}
    
}
