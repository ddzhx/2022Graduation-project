package com.javameizu.meizu.service;

import com.javameizu.meizu.domain.Pddetails;

import java.util.List;

/**
 * 详情service接口
 */
public interface PddetailsService {
    /**
     * 增加
     */
    public boolean insert(Pddetails pddetails);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 查询所有首页产品
     */
    public List<Pddetails> allPddetails();
}
