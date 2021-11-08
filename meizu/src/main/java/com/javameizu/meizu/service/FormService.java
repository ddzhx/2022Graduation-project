package com.javameizu.meizu.service;

import com.javameizu.meizu.domain.Cart;
import com.javameizu.meizu.domain.Form;

import java.util.List;

/**
 * 分类产品service接口
 */
public interface FormService {
    /**
     * 增加
     */
    public boolean insert(Form form);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 查询所有分类产品
     */
    public List<Form> allForm();

}
