package com.example.hobby.Service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.hobby.CustomUserDetail;
import com.example.hobby.Dao.MemberDao;
import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Entity.Member;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    // コンストラクタインジェクション
    private final MemberDao memberDao;
    public CustomUserDetailsService(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public UserDetails loadUserByUsername(String memberCode) throws UsernameNotFoundException {

        MemberDto user = new MemberDto();
        Member member = memberDao.selectMemberByMemberCode(memberCode);
        
        user.setMemberAddress(member.getMemberAddress());
        user.setMemberBirth(member.getMemberBirth());
        user.setMemberCode(member.getMemberCode());
        user.setMemberJoin(member.getMemberJoin());
        user.setMemberMail(member.getMemberMail());
        user.setMemberName(member.getMemberName());
        user.setMemberPass(member.getMemberPass());
        user.setMemberPhone(member.getMemberPhone());
        user.setMemberPost(member.getMemberPost());
        user.setMemberRank(member.getMemberRank());
        user.setMemberRole(member.getMemberRole());



        return new CustomUserDetail(user);
    }
}