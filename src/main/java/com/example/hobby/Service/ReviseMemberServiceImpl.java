package com.example.hobby.Service;

import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Entity.Member;

import org.springframework.stereotype.Service;

import com.example.hobby.BusinessException;
import com.example.hobby.Dao.MemberDao;

@Service
public class ReviseMemberServiceImpl implements ReviseMemberService{

    // コンストラクタインジェクション
    private final MemberDao memberDao;
    public ReviseMemberServiceImpl(MemberDao memberDao){
        this.memberDao = memberDao;
    }

    
    @Override
    public int ReviseMemberComplete(MemberDto memberDto){

        // memberエンティティを新規作成
        Member member = new Member();
        member.setMemberAddress(memberDto.getMemberAddress());
        member.setMemberBirth(memberDto.getMemberBirth());
        member.setMemberMail(memberDto.getMemberMail());
        member.setMemberName(memberDto.getMemberName());
        member.setMemberPhone(memberDto.getMemberPhone());
        member.setMemberPost(memberDto.getMemberPost());
        member.setMemberCode(memberDto.getMemberCode());


        Member mailMember = memberDao.selectMemberByMail(memberDto.getMemberMail());
        if(!mailMember.getMemberCode().equals(member.getMemberMail())){
            throw new BusinessException("このメールアドレスは既に登録されています");
        }

        // サービス呼び出し
        int num = memberDao.updateMember(member);
        return num;
    }

}
