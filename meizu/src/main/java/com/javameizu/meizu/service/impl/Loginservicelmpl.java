package com.javameizu.meizu.service.impl;

import com.javameizu.meizu.dao.LoginMapper;
import com.javameizu.meizu.domain.Login;
import com.javameizu.meizu.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 用户service实现类
 */
@Service
public class Loginservicelmpl implements LoginService {

    @Autowired
    private LoginMapper loginMapper;
    /**
     * 验证密码是否正确
     *
     * @param username
     * @param password
     */
    @Override
    public boolean verifyPassword(String username, String password) {
        return loginMapper.verifyPassword(username,password)>0;
    }

    /**
     * 验证密码是否正确
     *
     * @param username
     */
    @Override
    public boolean verifyUsername(String username) {
        return loginMapper.verifyUsername(username)>0;
    }

    /**
     * 注册用户
     *
     * @param login
     */
    @Override
    public boolean insert(Login login) {
        return loginMapper.insert(login)>0;
    }

    /**
     * 修改用户
     *
     * @param login
     */
    @Override
    public boolean update(Login login) {
        return loginMapper.update(login)>0;
    }

    /**
     * 查询用户
     */
    @Override
    public List<Login> alllogin() {
        return loginMapper.alllogin();
    }
}
