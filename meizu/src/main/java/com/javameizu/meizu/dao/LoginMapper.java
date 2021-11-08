package com.javameizu.meizu.dao;

import com.javameizu.meizu.domain.Cart;
import com.javameizu.meizu.domain.Login;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户登录注册DAO
 */
@Repository
public interface LoginMapper {
    /**
     * 验证用户与密码是否正确
     */
    public int verifyPassword(String username,String password);

    /**
     * 验证用户与密码是否正确
     */
    public int verifyUsername(String username);

    /**
     * 注册用户
     */
    public int insert(Login login);

    /*
    * 修改用户
    * */
    public int update(Login login);

    /*
     * 查询用户
     * */
    public List<Login> alllogin();


}
