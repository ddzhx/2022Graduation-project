package com.javameizu.meizu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 订单
 */
public class Form implements Serializable {
    /*主键*/
    private Integer id;
    /*商户码*/
    private String meform;
    /*订单名称*/
    private String clform;
    /*商品名*/
   private String comname;
    /*金额*/
    private String money;
    /*时间*/
   private Date focreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMeform() {
        return meform;
    }

    public void setMeform(String meform) {
        this.meform = meform;
    }

    public String getClform() {
        return clform;
    }

    public void setClform(String clform) {
        this.clform = clform;
    }

    public String getComname() {
        return comname;
    }

    public void setComname(String comname) {
        this.comname = comname;
    }

    public String getMoney() {
        return money;
    }

    public void setMoney(String money) {
        this.money = money;
    }

    public Date getFocreate() {
        return focreate;
    }

    public void setFocreate(Date focreate) {
        this.focreate = focreate;
    }
}
