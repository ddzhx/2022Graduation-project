package com.javameizu.meizu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 首页产品
 */
public class Home implements Serializable {
    /*主键*/
    private Integer id;
    /*价格*/
    private String money;
    /*图片*/
   private String homepic;
    /*时间*/
   private Date homecreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public String getHomepic() {
        return homepic;
    }

    public void setHomepic(String homepic) {
        this.homepic = homepic;
    }

    public Date getHomecreate() {
        return homecreate;
    }

    public void setHomecreate(Date homecreate) {
        this.homecreate = homecreate;
    }
}
