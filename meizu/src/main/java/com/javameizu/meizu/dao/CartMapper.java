package com.javameizu.meizu.dao;

import com.javameizu.meizu.domain.Cart;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 购物车
 */
@Repository
public interface CartMapper {
    /**
     * 添加轮播图
     */
    public int insert(Cart cart);

    /**
     * 修改
     */
    public int update(Cart cart);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 查询所有轮播图
     */
    public List<Cart> allCart();

}
