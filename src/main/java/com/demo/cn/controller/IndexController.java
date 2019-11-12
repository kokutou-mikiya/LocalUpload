package com.demo.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author: ZPT
 * @Description: 页面跳转
 * @Date: 2019-11-12 14:28
 **/
@Controller
public class IndexController {

    @GetMapping("index")
    public String index(){    //http://localhost:8080/index
        //跳转templates路径下的index页面
        return "index";
    }
}
