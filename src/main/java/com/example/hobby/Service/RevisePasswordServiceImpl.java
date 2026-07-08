package com.example.hobby.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.hobby.BusinessException;
import com.example.hobby.Dao.MemberDao;
import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Dto.PasswordDto;
import com.example.hobby.Entity.Member;

import org.springframework.security.crypto.password.PasswordEncoder;


@Service
public class RevisePasswordServiceImpl implements RevisePasswordService {

    // コンストラクタインジェクション
    public final MemberDao memberDao;
    private PasswordEncoder passwordEncoder;
    public RevisePasswordServiceImpl(MemberDao memberDao, PasswordEncoder passwordEncoder){
        this.memberDao = memberDao;
        this.passwordEncoder = passwordEncoder;
    }



    public MemberDto searchMemberByBirth(MemberDto memberDto){
        // メンバーのリストを新規作成
        List<Member> listMember = new ArrayList<Member>();

        

        // 誕生日一致ユーザーを呼び出す
        listMember = memberDao.selectMemberByBirth(memberDto.getMemberBirth());



        // メールと電話番号の確認
        for (Member member : listMember) {
            if(member.getMemberMail().equals(memberDto.getMemberMail()) || member.getMemberPhone().equals(memberDto.getMemberPhone())){
                memberDto.setMemberCode(member.getMemberCode());
                memberDto.setMemberBirth(member.getMemberBirth());
                memberDto.setMemberMail(member.getMemberMail());
                memberDto.setMemberPass(member.getMemberPass());
                memberDto.setMemberPhone(member.getMemberPhone());

                return memberDto;
            }
        }
        throw new BusinessException("該当するメンバー情報が見つかりません");
    }



    public int revisePasswordComplete(PasswordDto passwordDto){
        
        // Memberエンティティを新規作成
        Member member = new Member();
        
        // 更新が必要なものだけ代入
        member.setMemberCode(passwordDto.getMemberCode());
        //member.setMemberPass(passwordDto.getPassword());
        member.setMemberPass(passwordEncoder.encode(passwordDto.getPassword()));
        
        // メンバー情報更新
        int num = memberDao.updateMember(member);

        return num;
    }
}
