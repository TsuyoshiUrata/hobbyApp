package com.example.hobby.Dao;


import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.hobby.Entity.OrderDetail;


@Dao
@ConfigAutowireable
public interface OrderNumberingDao {
    
    @Select
    public OrderDetail selectOrderNumbering();

    @Update(sqlFile=true)
    public int updateOrderNumbering();
}