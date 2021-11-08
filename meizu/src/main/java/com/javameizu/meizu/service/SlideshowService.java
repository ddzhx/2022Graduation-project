package com.javameizu.meizu.service;

import com.javameizu.meizu.domain.Slideshow;

import java.util.List;

/**
 * 轮播图service接口
 */
public interface SlideshowService {
    /**
     * 增加
     */
    public boolean insert(Slideshow slideshow);

    /**
     * 删除
     */
    public boolean delete(Integer id);

    /**
     * 查询所有轮播图
     */
    public List<Slideshow> allSlideshow();
}
