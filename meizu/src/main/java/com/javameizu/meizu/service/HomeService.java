package com.javameizu.meizu.service;

import com.javameizu.meizu.domain.Home;

import java.util.List;

/**
 * 首页产品service接口
 */
public interface HomeService {
    /**
     * 增加
     */
    public boolean insert(Home home);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 查询所有首页产品
     */
    public List<Home> allHome();
}
