package com.example.demo.controller;

import com.example.dubbo.facade.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liuteng
 */
@RestController
@RequestMapping(value = "user/")
public class UserController {

    @DubboReference(version = "1.0.0")
    private UserService userService;

    @GetMapping(value = "/getUserIdByPhone")
    public String getUserIdByPhone(String phone){
        return userService.getUserIdByPhone(phone);
    }

}
