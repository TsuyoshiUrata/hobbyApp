package com.example.hobby.Dao;

import org.seasar.doma.Insert;
import org.seasar.doma.Dao;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.hobby.Entity.Cart;

@Dao
@ConfigAutowireable
public interface CartDao {
    
    @Insert(sqlFile = true)
    public int insertCart(Cart cart);
    
}
