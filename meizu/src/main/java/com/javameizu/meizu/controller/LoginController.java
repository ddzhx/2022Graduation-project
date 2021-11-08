package com.javameizu.meizu.controller;

import com.alibaba.fastjson.JSONObject;
import com.javameizu.meizu.domain.Cart;
import com.javameizu.meizu.domain.Login;
import com.javameizu.meizu.service.LoginService;
import com.javameizu.meizu.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@RestController
public class LoginController {

    @Autowired
    private LoginService loginService;

    /**
     * 判断是否登录成功
     */
    @RequestMapping(value = "/add/login/status",method = RequestMethod.POST)
    public Object loginStatus(HttpServletRequest request, HttpSession session){
        JSONObject jsonObject = new JSONObject();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        boolean flag = loginService.verifyPassword(name,password);
        if (flag){
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"登录成功");
            session.setAttribute(Consts.NAME,name);
            return jsonObject;
        }else {
            jsonObject.put(Consts.CODE, 0);
            jsonObject.put(Consts.MSG, "用户名或密码错误");
            return jsonObject;
        }
    }

    /**
     * 添加用户
     */
    @RequestMapping(value = "/add/register",method = RequestMethod.POST)
    public Object addregister(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String name = request.getParameter("name");
        String password = request.getParameter("password");
        String sex = request.getParameter("sex");
        String phone = request.getParameter("phone");
        String adderss = request.getParameter("adderss");
        String email = request.getParameter("email");

        Login login = new Login();
        login.setName(name);
        login.setPassword(password);
        login.setSex(new Byte(sex));
        login.setPhone(phone);
        login.setAdderss(adderss);
        login.setEmail(email);

        boolean login1 = loginService.verifyUsername(name);
        if (login1){
            jsonObject.put(Consts.CODE, 0);
            jsonObject.put(Consts.MSG, "用户名已存在");
            return jsonObject;
        }else {
            boolean flag = loginService.insert(login);
            if (flag){
                jsonObject.put(Consts.CODE,1);
                jsonObject.put(Consts.MSG,"注册");
                return jsonObject;
            }else {
                jsonObject.put(Consts.CODE, 0);
                jsonObject.put(Consts.MSG, "注册失败");
                return jsonObject;
            }
        }
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/login/update",method = RequestMethod.POST)
    public Object updatelogin(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String id = request.getParameter("id");
        String phone = request.getParameter("phone");
        String adderss = request.getParameter("adderss");
        String email = request.getParameter("email");

        //保存到个人信息的对象中
        Login login = new Login();
        login.setId(Integer.parseInt(id));
        login.setPhone(phone);
        login.setAdderss(adderss);
        login.setEmail(email);
        boolean flag = loginService.update(login);
        if(flag){   //修改成功
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"修改成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"修改失败");
        return jsonObject;
    }

    /**
     * 查询用户
     */
    @RequestMapping(value = "/login/alllogin",method = RequestMethod.GET)
    public Object alllogin(HttpServletRequest request){
        return loginService.alllogin();
    }
}
