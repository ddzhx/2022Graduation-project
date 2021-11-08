package com.javameizu.meizu.controller;


import com.alibaba.fastjson.JSONObject;
import com.javameizu.meizu.domain.Cart;
import com.javameizu.meizu.domain.Find;
import com.javameizu.meizu.domain.Login;
import com.javameizu.meizu.service.CartService;
import com.javameizu.meizu.service.FindService;
import com.javameizu.meizu.utils.Consts;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * 首页产品controller
 */
@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    /**
     * 添加首页产品
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addcart(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String crusername = request.getParameter("crusername");
        String crpic = request.getParameter("crpic");
        String crname = request.getParameter("crname");
        String crprice = request.getParameter("crprice");
        String crmunder = request.getParameter("crmunder");
        String crformat = request.getParameter("crformat");
        String isGoods = request.getParameter("isGoods");

        Cart cart = new Cart();
        cart.setCrusername(crusername);
        cart.setCrpic(crpic);
        cart.setCrname(crname);
        cart.setCrprice(crprice);
        cart.setCrmunder(crmunder);
        cart.setCrformat(crformat);
        cart.setIsGoods(isGoods);

            boolean flag = cartService.insert(cart);
            if (flag){
                jsonObject.put(Consts.CODE,1);
                jsonObject.put(Consts.MSG,"添加购物车成功");
                return jsonObject;
            }else {
                jsonObject.put(Consts.CODE, 0);
                jsonObject.put(Consts.MSG, "添加购物车失败");
                return jsonObject;
            }
        }

    /**
     * 查询购物车
     */
    @RequestMapping(value = "/allCart",method = RequestMethod.GET)
    public Object allCart(HttpServletRequest request){
        return cartService.allCart();
    }

    /**
     *
     * 删除购物车
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Object deleteCart(HttpServletRequest request){
        String id = request.getParameter("id");
        boolean flag = cartService.delete(Integer.parseInt(id));
        return flag;
    }

    /**
     * 修改
     */
    @RequestMapping(value = "/update",method = RequestMethod.POST)
    public Object updatecart(HttpServletRequest request){
        JSONObject jsonObject = new JSONObject();
        String id = request.getParameter("id");
        String crmunder = request.getParameter("crmunder");

        //保存到商品在对象中
        Cart cart = new Cart();
        cart.setId(Integer.parseInt(id));
        cart.setCrmunder(crmunder);
        boolean flag = cartService.update(cart);
        if(flag){   //保存成功
            jsonObject.put(Consts.CODE,1);
            jsonObject.put(Consts.MSG,"修改成功");
            return jsonObject;
        }
        jsonObject.put(Consts.CODE,0);
        jsonObject.put(Consts.MSG,"修改失败");
        return jsonObject;
    }

}
