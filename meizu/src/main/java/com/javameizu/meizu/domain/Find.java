package com.javameizu.meizu.domain;

import java.io.Serializable;
import java.util.Date;

/**
 * 发现页
 */
public class Find implements Serializable {
    /*主键*/
    private Integer id;
    /*作者名*/
    private String name;
    /*图片*/
    private String findpic;
    /*阅读量*/
    private String findread;
    /*标题*/
    private String findtitle;
    /*时间*/
    private Date findcreate;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFindpic() {
        return findpic;
    }

    public void setFindpic(String findpic) {
        this.findpic = findpic;
    }

    public String getFindread() {
        return findread;
    }

    public void setFindread(String findread) {
        this.findread = findread;
    }

    public String getFindtitle() {
        return findtitle;
    }

    public void setFindtitle(String findtitle) {
        this.findtitle = findtitle;
    }

    public Date getFindcreate() {
        return findcreate;
    }

    public void setFindcreate(Date findcreate) {
        this.findcreate = findcreate;
    }
}
