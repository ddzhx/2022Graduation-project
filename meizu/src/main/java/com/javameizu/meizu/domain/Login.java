package com.javameizu.meizu.domain;

import java.io.Serializable;

/**
 * 用户登录注册
 */
public class Login implements Serializable {
    /*主键*/
    private Integer id;
    /*用户名*/
    private String name;
    /*密码*/
    private String password;
    /*性别*/
    private Byte sex;
    /*手机号码*/
    private String phone;
    /*地址*/
    private String adderss;
    /*邮箱*/
    private String email;

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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Byte getSex() {
        return sex;
    }

    public void setSex(Byte sex) {
        this.sex = sex;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAdderss() {
        return adderss;
    }

    public void setAdderss(String adderss) {
        this.adderss = adderss;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
