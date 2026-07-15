package com.example.hobby.Dao;

import java.util.List;

import org.seasar.doma.Dao;
import org.seasar.doma.Select;
import org.seasar.doma.Update;
import org.seasar.doma.boot.ConfigAutowireable;

import com.example.hobby.Entity.Product;
import com.example.hobby.Entity.ProductComposit;

@Dao
@ConfigAutowireable
public interface ProductDao {
    
    @Select
    public List<ProductComposit> productList();

    @Select
    public ProductComposit productDetail(String productId);

    @Select
    public List<ProductComposit> searchProductList(String productName);

    @Update
    public int updateProductStock(Product product);


}