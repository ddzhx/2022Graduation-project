package com.javameizu.meizu.service;

import com.javameizu.meizu.domain.Find;
import com.javameizu.meizu.domain.Home;

import java.util.List;

/**
 * 发现service接口
 */
public interface FindService {
    /**
     * 增加
     */
    public boolean insert(Find find);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 查询所有首页产品
     */
    public List<Find> allFind();

    /**
     *修改
     */
    public boolean update(Find find);
}
