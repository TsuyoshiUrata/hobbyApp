package com.example.hobby.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hobby.Dao.MemberDao;
import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Entity.Member;

@Service
public class MemberListServiceImpl implements MemberListService {

    // コンストラクタインジェクション
    private MemberDao memberDao;

    public MemberListServiceImpl(MemberDao memberDao) {
        this.memberDao = memberDao;
    }

    @Override
    public List<MemberDto> memberList(String memberRole) {
        // リストを新規作成
        List<MemberDto> listMemberDto = new ArrayList<MemberDto>();

        // memberRoleを持つmemberのリストをlistMemberに代入
        List<Member> listMember = memberDao.selectAllMemberByRole(memberRole);

        // memberDtoに移し替え
        for (Member member : listMember) {
            // addするmemberDtoを新規作成
            MemberDto memberDto = new MemberDto(member.getMemberCode(),
                    member.getMemberName(),
                    member.getMemberMail(),
                    member.getMemberPhone(),
                    member.getMemberPost(),
                    member.getMemberAddress(),
                    member.getMemberBirth(),
                    member.getMemberJoin(),
                    null,
                    member.getMemberRole(),
                    member.getMemberPass());
            // ランクだけは後から追加
            memberDto.setMemberRank(member.getMemberRank());
            // listに格納
            listMemberDto.add(memberDto);
        }
        return listMemberDto;
    }

    @Override
    public MemberDto memberListDetail(String memberCode){
        Member member = memberDao.selectMemberByMemberCode(memberCode);
        
        MemberDto memberDto = new MemberDto(member.getMemberCode(),
                    member.getMemberName(),
                    member.getMemberMail(),
                    member.getMemberPhone(),
                    member.getMemberPost(),
                    member.getMemberAddress(),
                    member.getMemberBirth(),
                    member.getMemberJoin(),
                    null,
                    member.getMemberRole(),
                    member.getMemberPass());
            // ランクだけは後から追加
            memberDto.setMemberRank(member.getMemberRank());
        
            return memberDto;
    }
}
