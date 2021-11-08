package com.javameizu.meizu.service.impl;

import com.javameizu.meizu.dao.HomeMapper;
import com.javameizu.meizu.domain.Home;
import com.javameizu.meizu.service.HomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Homeimpl implements HomeService {
    @Autowired
    private HomeMapper homeMapper;

    /**
     * 增加
     *
     * @param home
     */
    @Override
    public boolean insert(Home home) {
        return homeMapper.insert(home)>0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return homeMapper.delete(id)>0;
    }

    /**
     * 查询所有首页产品
     */
    @Override
    public List<Home> allHome() {
        return homeMapper.allHome();
    }
}
