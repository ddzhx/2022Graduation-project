package com.javameizu.meizu.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class PicConfig implements WebMvcConfigurer {

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        //轮播图图片地址
        registry.addResourceHandler("/img/slideshowPic/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+"slideshowPic"+System.getProperty("file.separator")
        );

        //首页产品地址
        registry.addResourceHandler("/img/homePic/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+"homePic"+System.getProperty("file.separator")
        );

        //分类产品地址
        registry.addResourceHandler("/img/classifyPic/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+"classifyPic"+System.getProperty("file.separator")
        );

        //发现地址
        registry.addResourceHandler("/img/findPic/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+"findPic"+System.getProperty("file.separator")
        );

        //详情地址
        registry.addResourceHandler("/img/pddetailsPic/**").addResourceLocations(
                "file:"+System.getProperty("user.dir")+System.getProperty("file.separator")+"img"
                        +System.getProperty("file.separator")+"pddetailsPic"+System.getProperty("file.separator")
        );
    }
}
