package com.example.hobby.Service;

import com.example.hobby.Dao.CartDao;
import com.example.hobby.Dto.CartDto;
import com.example.hobby.Entity.Cart;

public class OrderServiceImpl implements OrderService{

            // コンストラクタインジェクション
        private final CartDao cartDao;
        public OrderServiceImpl(CartDao cartDao){
            this.cartDao = cartDao;
        }

    public int cartComplete(CartDto cartDto){

        Cart cart = new Cart();
        cart.setMemberCode(cartDto.getMemberCode());
        cart.setQuantity(cartDto.getQuantity());
        cart.setPrice(cartDto.getPrice());
        cart.setProductId(cartDto.getProductId());
        cart.setCartId(0);

        cartDao.insertCart(cart);
        return 0;
    }
    
}
