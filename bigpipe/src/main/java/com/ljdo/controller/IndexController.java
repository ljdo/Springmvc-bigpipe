package com.ljdo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 首页控制器
 * @author fly
 * @create 2016-01-2016/1/13 18:55
 */
@Controller
public class IndexController {

    @RequestMapping("index")
    public String index(Model model,String name){

        return "index";
    }



    @RequestMapping("module1")
    public String module1(Model model,String name){

        return "module1";
    }

    @RequestMapping("module2")
    public String module2(Model model,String name){

        return "module1";
    }
}
