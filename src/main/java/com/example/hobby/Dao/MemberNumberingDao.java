package com.example.hobby.Dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.hobby.Entity.MemberNumbering;

@Dao
@ConfigAutowireable
public interface MemberNumberingDao {
    @Select
    public MemberNumbering selectMemberNumbering();

    @Update(sqlFile=true)
    public int updateMemberNumbering();
}
