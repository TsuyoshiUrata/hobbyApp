package com.example.hobby.Service;

import java.util.List;

import com.example.hobby.Dto.MemberDto;


public interface MemberListService {
    public List<MemberDto> memberList(String memberRole);
    public MemberDto memberListDetail(String memberCode);
} 