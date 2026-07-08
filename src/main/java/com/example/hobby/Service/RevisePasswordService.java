package com.example.hobby.Service;

import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Dto.PasswordDto;

public interface RevisePasswordService {

    public MemberDto searchMemberByBirth(MemberDto memberDto);

    public int revisePasswordComplete(PasswordDto passwordDto);
    
}
