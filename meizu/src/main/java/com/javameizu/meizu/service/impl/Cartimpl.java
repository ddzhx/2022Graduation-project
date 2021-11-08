package com.javameizu.meizu.service.impl;

import com.javameizu.meizu.dao.CartMapper;
import com.javameizu.meizu.domain.Cart;
import com.javameizu.meizu.domain.Cart;
import com.javameizu.meizu.service.CartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Cartimpl implements CartService {
    @Autowired
    private CartMapper cartMapper;

    /**
     * 增加
     *
     * @param cart
     */
    @Override
    public boolean insert(Cart cart) {
        return cartMapper.insert(cart)>0;
    }

    /**
     * 修改
     *
     * @param cart
     */
    @Override
    public boolean update(Cart cart) {
        return cartMapper.update(cart)>0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return cartMapper.delete(id)>0;
    }

    /**
     * 查询所有分类产品
     */
    @Override
    public List<Cart> allCart() {
        return cartMapper.allCart();
    }

}
