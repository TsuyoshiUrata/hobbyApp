package com.example.hobby;

import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;

import java.util.List;

import com.example.hobby.Dto.MemberDto;

public class CustomUserDetail extends User {

    private MemberDto memberDto;

    public CustomUserDetail(MemberDto memberDto) {
        super(memberDto.getMemberCode(), memberDto.getMemberPass(), List.of(new SimpleGrantedAuthority("ROLE_" + memberDto.getMemberRole().toUpperCase())));
        // コンストラクタインジェクションによってmemberDtoを呼び出せるようになる
        this.memberDto = memberDto;
    }

    public MemberDto getMemberDto() {
        return memberDto;
    }

    public void setMemberDto(MemberDto memberDto) {
        this.memberDto = memberDto;
    }
}
