package com.javameizu.meizu.service.impl;

import com.javameizu.meizu.dao.FormMapper;
import com.javameizu.meizu.domain.Form;
import com.javameizu.meizu.service.FormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Formimpl implements FormService {
    @Autowired
    private FormMapper formMapper;

    /**
     * 增加
     *
     * @param form
     */
    @Override
    public boolean insert(Form form) {
        return formMapper.insert(form)>0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return formMapper.delete(id)>0;
    }

    /**
     * 查询所有分类产品
     */
    @Override
    public List<Form> allForm() {
        return formMapper.allForm();
    }
}
