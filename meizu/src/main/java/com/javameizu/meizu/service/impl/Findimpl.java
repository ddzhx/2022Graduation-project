package com.javameizu.meizu.service.impl;

import com.javameizu.meizu.dao.FindMapper;
import com.javameizu.meizu.dao.HomeMapper;
import com.javameizu.meizu.domain.Find;
import com.javameizu.meizu.domain.Home;
import com.javameizu.meizu.service.FindService;
import com.javameizu.meizu.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Findimpl implements FindService {
    @Autowired
    private FindMapper findMapper;


    /**
     * 增加
     *
     * @param find
     */
    @Override
    public boolean insert(Find find) {
        return findMapper.insert(find)>0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return findMapper.delete(id)>0;
    }

    /**
     * 查询所有首页产品
     */
    @Override
    public List<Find> allFind() {
        return findMapper.allFind();
    }

    /**
     * 修改
     *
     * @param find
     */
    @Override
    public boolean update(Find find) {
        return findMapper.update(find)>0;
    }


}
