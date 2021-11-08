package com.javameizu.meizu.service;

import com.javameizu.meizu.domain.Login;

import java.util.List;

/**
 * 用户servi接口
 */
public interface LoginService {

    /**
     * 验证密码是否正确
     */
    public boolean verifyPassword(String username,String password);

    /**
     * 验证密码是否正确
     */
    public boolean verifyUsername(String username);

    /**
     * 注册用户
     */
    public boolean insert(Login login);

    /**
     * 修改用户
     */
    public boolean update(Login login);

    /**
     * 修改用户
     */
    public List<Login> alllogin();
}
