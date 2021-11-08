package com.javameizu.meizu.dao;

import com.javameizu.meizu.domain.Home;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 首页产品
 */
@Repository
public interface HomeMapper {
    /**
     * 添加首页产品
     */
    public int insert(Home home);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 查询所有首页产品
     */
    public List<Home> allHome();
}
