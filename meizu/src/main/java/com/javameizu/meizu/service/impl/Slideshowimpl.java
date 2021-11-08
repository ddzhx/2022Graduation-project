package com.javameizu.meizu.service.impl;

import com.javameizu.meizu.dao.SlideshowMapper;
import com.javameizu.meizu.domain.Slideshow;
import com.javameizu.meizu.service.SlideshowService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Slideshowimpl implements SlideshowService {
    @Autowired
    private SlideshowMapper slideshowMapper;

    /**
     * 增加
     *
     * @param slideshow
     */
    @Override
    public boolean insert(Slideshow slideshow) {
        return slideshowMapper.insert(slideshow)>0;
    }

    /**
     * 删除
     *
     * @param id
     */
    @Override
    public boolean delete(Integer id) {
        return slideshowMapper.delete(id)>0;
    }

    /**
     * 查询所有轮播图
     */
    @Override
    public List<Slideshow> allSlideshow() {
        return slideshowMapper.allSlideshow();
    }
}
