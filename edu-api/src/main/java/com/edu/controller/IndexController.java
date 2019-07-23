package com.edu.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping
@Controller
@Slf4j
public class IndexController {

    @RequestMapping("/")
    public String index(){
        log.info("开始进入登录页面请求");
        return "login";
    }
}
