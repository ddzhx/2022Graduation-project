package com.javameizu.meizu.controller;


import com.alibaba.fastjson.JSONObject;
import com.javameizu.meizu.domain.Form;
import com.javameizu.meizu.service.FormService;
import com.javameizu.meizu.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * 首页产品controller
 */
@RestController
@RequestMapping("/form")
public class FormController {

    @Autowired
    private FormService formService;

    /**
     * 添加首页产品
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addform(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String meform = request.getParameter("meform");
        String clform = request.getParameter("clform");
        String comname = request.getParameter("comname");
        String money = request.getParameter("money");

        Form form = new Form();
        form.setMeform(meform);
        form.setClform(clform);
        form.setComname(comname);
        form.setMoney(money);

            boolean flag = formService.insert(form);
            if (flag){
                jsonObject.put(Consts.CODE,1);
                jsonObject.put(Consts.MSG,"提交订单成功");
                return jsonObject;
            }else {
                jsonObject.put(Consts.CODE, 0);
                jsonObject.put(Consts.MSG, "提交订单失败");
                return jsonObject;
            }
        }

    /**
     * 查询购物车
     */
    @RequestMapping(value = "/allForm",method = RequestMethod.GET)
    public Object allForm(HttpServletRequest request){
        return formService.allForm();
    }

    /**
     *
     * 删除购物车
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Object deleteForm(HttpServletRequest request){
        String id = request.getParameter("id");
        boolean flag = formService.delete(Integer.parseInt(id));
        return flag;
    }


}
