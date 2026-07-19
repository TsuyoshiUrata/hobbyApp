package com.example.hobby.Dao;

import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.hobby.Entity.OrderInfo;


@Dao
@ConfigAutowireable
public interface OrderInfoDao {
    
    @Insert
    public int insertOrderInfo(OrderInfo orderInfo);

}