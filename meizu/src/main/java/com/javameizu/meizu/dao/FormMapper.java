package com.javameizu.meizu.dao;

import com.javameizu.meizu.domain.Form;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 订单
 */
@Repository
public interface FormMapper {
    /**
     * 添加轮订单
     */
    public int insert(Form form);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 查询所有订单
     */
    public List<Form> allForm();

}
