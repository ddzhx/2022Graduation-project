package com.javameizu.meizu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 分类产品
 */
public class Classify implements Serializable {
    /*主键*/
    private Integer id;
    /*产品名*/
    private String productname;
    /*图片*/
   private String productpic;
   /*产品类型*/
    private Byte producttpye;
    /*时间*/
   private Date productcreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductpic() {
        return productpic;
    }

    public void setProductpic(String productpic) {
        this.productpic = productpic;
    }

    public Byte getProducttpye() {
        return producttpye;
    }

    public void setProducttpye(Byte producttpye) {
        this.producttpye = producttpye;
    }

    public Date getProductcreate() {
        return productcreate;
    }

    public void setProductcreate(Date productcreate) {
        this.productcreate = productcreate;
    }
}
