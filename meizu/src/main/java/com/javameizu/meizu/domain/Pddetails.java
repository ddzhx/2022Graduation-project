package com.javameizu.meizu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 详情页数据
 */
public class Pddetails implements Serializable {
    /*主键*/
    private Integer id;
    /*产品名称*/
    private String pdname;
    /*图片*/
    private String pdpic;
    /*价格*/
    private String pdprice;
    /*内容*/
    private String pdcontext;
    /*时间*/
    private Date pddate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPdname() {
        return pdname;
    }

    public void setPdname(String pdname) {
        this.pdname = pdname;
    }

    public String getPdpic() {
        return pdpic;
    }

    public void setPdpic(String pdpic) {
        this.pdpic = pdpic;
    }

    public String getPdprice() {
        return pdprice;
    }

    public void setPdprice(String pdprice) {
        this.pdprice = pdprice;
    }

    public String getPdcontext() {
        return pdcontext;
    }

    public void setPdcontext(String pdcontext) {
        this.pdcontext = pdcontext;
    }

    public Date getPddate() {
        return pddate;
    }

    public void setPddate(Date pddate) {
        this.pddate = pddate;
    }
}
