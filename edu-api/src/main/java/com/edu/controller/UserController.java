package com.edu.controller;

import com.alibaba.fastjson.JSON;
import com.edu.service.UserService;
import com.edu.vo.UserInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : wangxueyang[wxueyanghj@163.com]
 * @version ： 1.0.0
 * @package : com.edu.controller
 * @progect : edu
 * @Description :
 * @Creation Date ：2019年06月23日9:50 AM
 */
@Controller
@RequestMapping("/edu/api")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("toRegister")
    public String toRegister(){
        return "user/register";
    }

    @ResponseBody
    @GetMapping("/queryUserInfo")
    public String queryUserInfo() {
        UserInfoVo userInfoVo = userService.queryUserInfo();
        return JSON.toJSONString(userInfoVo);
    }
}
