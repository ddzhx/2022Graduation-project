package com.javameizu.meizu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 购车
 */
public class Cart implements Serializable {
    /*主键*/
    private Integer id;
    /*用户姓名*/
    private String crusername;
    /*图片*/
    private String crpic;
    /*产品名*/
   private String crname;
    /*类型*/
    private String crformat;
    /*数量*/
    private String crmunder;
    /*选中*/
    private String isGoods;
    /*价格*/
    private String crprice;
    /*时间*/
   private Date createdate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCrusername() {
        return crusername;
    }

    public void setCrusername(String crusername) {
        this.crusername = crusername;
    }

    public String getCrpic() {
        return crpic;
    }

    public void setCrpic(String crpic) {
        this.crpic = crpic;
    }

    public String getCrname() {
        return crname;
    }

    public void setCrname(String crname) {
        this.crname = crname;
    }

    public String getCrformat() {
        return crformat;
    }

    public void setCrformat(String crformat) {
        this.crformat = crformat;
    }

    public String getCrmunder() {
        return crmunder;
    }

    public void setCrmunder(String crmunder) {
        this.crmunder = crmunder;
    }

    public String getIsGoods() {
        return isGoods;
    }

    public void setIsGoods(String isGoods) {
        this.isGoods = isGoods;
    }

    public String getCrprice() {
        return crprice;
    }

    public void setCrprice(String crprice) {
        this.crprice = crprice;
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }
}
