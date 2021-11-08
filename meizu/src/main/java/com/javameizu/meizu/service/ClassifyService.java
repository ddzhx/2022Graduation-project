package com.javameizu.meizu.service;

import com.javameizu.meizu.domain.Classify;

import java.util.List;

/**
 * 分类产品service接口
 */
public interface ClassifyService {
    /**
     * 增加
     */
    public boolean insert(Classify classify);

    /**
     * 修改
     */
    public boolean update(Classify classify);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 查询所有分类产品
     */
    public List<Classify> allClassify();

    /**
     * 根据类型
     */

    public List<Classify> classifyOfftype(Integer producttpye);

}
