package com.example.hobby.Dao;

import java.time.LocalDate;
import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.hobby.Entity.Member;

@Dao
@ConfigAutowireable
public interface MemberDao {
    @Insert
    public int resistMemberComplete(Member member);

    @Select
    public Member selectMemberByMail(String memberMail);

    @Select
    public Member selectMemberByMemberCode(String memberCode);

    @Select
    public List<Member> selectAllMemberByRole(String memberRole);

    @Update(excludeNull = true)
    public int updateMember(Member member);

    @Select
    public List<Member> selectMemberByBirth(LocalDate birthDate);
    
}
