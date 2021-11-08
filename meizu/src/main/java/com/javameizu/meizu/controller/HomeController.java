package com.javameizu.meizu.controller;


import com.alibaba.fastjson.JSONObject;
import com.javameizu.meizu.domain.Home;
import com.javameizu.meizu.service.HomeService;
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
@RequestMapping("/home")
public class HomeController {

    @Autowired
    private HomeService homeService;

    /**
     * 添加首页产品
     */
    @RequestMapping(value = "/add",method = RequestMethod.POST)
    public Object addhome(HttpServletRequest request,@RequestParam("file") MultipartFile avatorFile){
        JSONObject jsonObject = new JSONObject();
        String money = request.getParameter("money");
        String homecreate = request.getParameter("homecreate");
        //把创建时间改为“yyyy-MM-dd”格式
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date prcDate = new Date();
        try{
            prcDate = dateFormat.parse(homecreate);
        }catch (ParseException e){
            e.printStackTrace();
        }
        if (avatorFile.isEmpty()){
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"文件上传失败");
            return jsonObject;
        }

        //文件名=当前时间到毫秒+原来的文件名
        String fileName = System.currentTimeMillis()+avatorFile.getOriginalFilename();
        //文件路径
        String filePath = System.getProperty("user.dir") + System.getProperty("file.separator") + "img"
                + System.getProperty("file.separator") + "homePic";
        //如果文件路径不存在，新增该路径地址
        File file1 = new File(filePath);
        if (!file1.exists()){
            file1.mkdir();
        }
        //实际文件地址
        File dest = new File(filePath + System.getProperty("file.separator") + fileName);
        //存储到数据库里的相对文件地址
        String storeAvatorPath = "/img/homePic/" + fileName;
        try {
            avatorFile.transferTo(dest);
            Home home = new Home();
            home.setMoney(money);
            home.setHomepic(storeAvatorPath);
            home.setHomecreate(prcDate);
            boolean flag = homeService.insert(home);
            if (flag){
                jsonObject.put(Consts.CODE,1);
                jsonObject.put(Consts.MSG,"添加成功");
                jsonObject.put("pic",storeAvatorPath);
                return jsonObject;
            }
            jsonObject.put(Consts.CODE,0);
            jsonObject.put(Consts.MSG,"上传失败");
            return jsonObject;
        } catch (IOException e) {
            jsonObject.put(Consts.CODE, 0);
            jsonObject.put(Consts.MSG, "上传失败" + e.getMessage());
        }finally {
            return jsonObject;
        }
        }

    /**
     * 查询所有首页产品
     */
    @RequestMapping(value = "/allHome",method = RequestMethod.GET)
    public Object allHome(HttpServletRequest request){
        return homeService.allHome();
    }

    /**
     *
     * 删除首页产品
     */
    @RequestMapping(value = "/delete",method = RequestMethod.GET)
    public Object deleteHome(HttpServletRequest request){
        String id = request.getParameter("id");
        boolean flag = homeService.delete(Integer.parseInt(id));
        return flag;
    }

}
