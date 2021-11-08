package com.javameizu.meizu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 轮播图
 */
public class Slideshow implements Serializable {
    /*主键*/
    private Integer id;
    /*图片名*/
    private String namepic;
    /*图片*/
   private String pic;
    /*时间*/
   private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNamepic() {
        return namepic;
    }

    public void setNamepic(String namepic) {
        this.namepic = namepic;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
