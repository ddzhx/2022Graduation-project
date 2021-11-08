package com.javameizu.meizu.dao;

import com.javameizu.meizu.domain.Find;
import com.javameizu.meizu.domain.Home;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 发现页
 */
@Repository
public interface FindMapper {
    /**
     * 添加首页产品
     */
    public int insert(Find find);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 查询所有首页产品
     */
    public List<Find> allFind();

    /**
     *修改
     */
    public int update(Find find);

}
