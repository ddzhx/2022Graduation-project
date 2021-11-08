package com.javameizu.meizu.service;

import com.javameizu.meizu.domain.Cart;
import com.javameizu.meizu.domain.Find;

import java.util.List;

/**
 * 分类产品service接口
 */
public interface CartService {
    /**
     * 增加
     */
    public boolean insert(Cart cart);

    /**
     * 修改
     */
    public boolean update(Cart cart);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 查询所有分类产品
     */
    public List<Cart> allCart();

}
