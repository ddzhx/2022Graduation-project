package com.javameizu.meizu.dao;

import com.javameizu.meizu.domain.Classify;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 分类产品
 */
@Repository
public interface ClassifyMapper {
    /**
     * 添加轮播图
     */
    public int insert(Classify classify);

    /**
     * 修改
     */
    public int update(Classify classify);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 查询所有轮播图
     */
    public List<Classify> allClassify();

    /**
     * 根据类型查询
     */
    public List<Classify> classifyOfftype(Integer producttpye);

}
