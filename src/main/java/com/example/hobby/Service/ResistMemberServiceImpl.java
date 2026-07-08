package com.example.hobby.Service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.hobby.BusinessException;
import com.example.hobby.Dao.MemberDao;
import com.example.hobby.Dao.MemberNumberingDao;
import com.example.hobby.Dto.MemberDto;
import com.example.hobby.Entity.Member;

import org.springframework.security.crypto.password.PasswordEncoder;

import java.time.LocalDate;

@Service
public class ResistMemberServiceImpl implements ResistMemberService {

    // コンストラクタインジェクション
    private MemberDao memberDao;
    private MemberNumberingDao memberNumberingDao;
    private PasswordEncoder passwordEncoder;

    public ResistMemberServiceImpl(MemberDao memberDao, MemberNumberingDao memberNumberingDao, PasswordEncoder passwordEncoder) {
        this.memberDao = memberDao;
        this.memberNumberingDao = memberNumberingDao;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    @Transactional
    public int resistMemberComplete(MemberDto memberDto) {
        // エンティティを新規作成
        Member member = new Member();
        member.setMemberAddress(memberDto.getMemberAddress());
        member.setMemberBirth(memberDto.getMemberBirth());
        member.setMemberJoin(LocalDate.now());
        member.setMemberMail(memberDto.getMemberMail());
        member.setMemberName(memberDto.getMemberName());
        member.setMemberPhone(memberDto.getMemberPhone());
        member.setMemberPost(memberDto.getMemberPost());
        member.setMemberRank(0);
        member.setMemberRole(memberDto.getMemberRole());

        //メール重複確認
        if(memberDao.selectMemberByMail(member.getMemberMail()) != null){
            throw new BusinessException("このメールアドレスは既に登録されています");
        }

        //メンバーコードの自動採番
        if (memberDto.getMemberRole().equals("customer")) {
            member.setMemberCode("CM" + String.format("%04d", memberNumberingDao.selectMemberNumbering().getMemberNumbering()));
        } else if (memberDto.getMemberRole().equals("employee")) {
            member.setMemberCode("EM" + String.format("%04d", memberNumberingDao.selectMemberNumbering().getMemberNumbering()));
        }

        //ハッシュ化
        member.setMemberPass(passwordEncoder.encode(memberDto.getMemberPass()));

        //登録
        int result = memberDao.resistMemberComplete(member);

        //メンバー番号更新
        memberNumberingDao.updateMemberNumbering();

        //更新件数を返す
        return result;

    }

}
