package com.edu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;

@RequestMapping
@Controller
@Slf4j
public class IndexController {

    @RequestMapping("/")
    public String index(Map<String, String> map){
        log.info("开始进入登录页面请求");
        map.put("name","wangxueyang");
        map.put("age","18");
        return "login";
    }
}
