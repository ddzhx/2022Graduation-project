package com.javameizu.meizu.dao;

import com.javameizu.meizu.domain.Pddetails;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 详情页
 */
@Repository
public interface PddetailsMapper {
    /**
     * 添加详情页内容
     */
    public int insert(Pddetails pddetails);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 查询所有首页产品
     */
    public List<Pddetails> allPddetails();
}
