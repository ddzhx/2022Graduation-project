package com.javameizu.meizu.dao;

import com.javameizu.meizu.domain.Slideshow;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 轮播图
 */
@Repository
public interface SlideshowMapper {
    /**
     * 添加轮播图
     */
    public int insert(Slideshow slideshow);

    /**
     * 删除
     */
    public int delete(Integer id);

    /**
     * 查询所有轮播图
     */
    public List<Slideshow> allSlideshow();
}
