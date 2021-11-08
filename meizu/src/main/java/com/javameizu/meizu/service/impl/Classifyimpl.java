package com.javameizu.meizu.service.impl;

import com.javameizu.meizu.dao.ClassifyMapper;
import com.javameizu.meizu.domain.Classify;
import com.javameizu.meizu.service.ClassifyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Classifyimpl implements ClassifyService {
    @Autowired
    private ClassifyMapper classifyMapper;

    /**
     * 增加
     *
     * @param classify
     */
    @Override
    public boolean insert(Classify classify) {
        return classifyMapper.insert(classify)>0;
    }

    /**
     * 修改
     *
     * @param classify
     */
    @Override
    public boolean update(Classify classify) {
        return false;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return classifyMapper.delete(id)>0;
    }

    /**
     * 查询所有分类产品
     */
    @Override
    public List<Classify> allClassify() {
        return classifyMapper.allClassify();
    }

    /**
     * 根据类型
     *
     * @param producttpye
     */
    @Override
    public List<Classify> classifyOfftype(Integer producttpye) {
        return null;
    }
}
