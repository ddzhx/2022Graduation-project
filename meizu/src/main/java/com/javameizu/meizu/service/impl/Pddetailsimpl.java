package com.javameizu.meizu.service.impl;

import com.javameizu.meizu.dao.FindMapper;
import com.javameizu.meizu.dao.PddetailsMapper;
import com.javameizu.meizu.domain.Find;
import com.javameizu.meizu.domain.Pddetails;
import com.javameizu.meizu.service.FindService;
import com.javameizu.meizu.service.PddetailsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Pddetailsimpl implements PddetailsService {
    @Autowired
    private PddetailsMapper pddetailsMapper;


    /**
     * 增加
     *
     * @param pddetails
     */
    @Override
    public boolean insert(Pddetails pddetails) {
        return pddetailsMapper.insert(pddetails)>0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return pddetailsMapper.delete(id)>0;
    }

    /**
     * 查询所有首页产品
     */
    @Override
    public List<Pddetails> allPddetails() {
        return pddetailsMapper.allPddetails();
    }
}
