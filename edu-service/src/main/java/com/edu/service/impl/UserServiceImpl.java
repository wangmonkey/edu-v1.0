package com.edu.service.impl;

import com.edu.service.UserService;
import com.edu.vo.UserInfoVo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @version ： 1.0.0
 * @package : com.edu.service.impl
 * @progect : edu
 * @Description :
 * @Created by : wangxueyang[wxueyanghj@163.com]
 * @Creation Date ：2019年06月23日9:33 AM
 */
@Service
@Slf4j
public class UserServiceImpl implements UserService {
    @Override
    public UserInfoVo queryUserInfo() {
        log.info("用户信息查询。。。。。");
        return null;
    }
}
