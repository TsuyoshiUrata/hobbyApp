package com.example.hobby.Dao;



import org.seasar.doma.Dao;
import org.seasar.doma.Insert;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.hobby.Entity.OrderDetail;


@Dao
@ConfigAutowireable
public interface OrderDetailDao {
    
    @Insert
    public int insertOrderDetail(OrderDetail orderDetails);

}