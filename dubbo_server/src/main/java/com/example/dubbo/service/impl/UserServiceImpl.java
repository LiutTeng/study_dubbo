package com.example.dubbo.service.impl;

import com.example.dubbo.facade.service.UserService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

/**
 * @author liuteng
 */
@Component
@DubboService(timeout = 500, version = "1.0.0", interfaceClass = UserService.class)
public class UserServiceImpl implements UserService {

    @Override
    public String getUserIdByPhone(String phone) {
        return "1000000101001";
    }

}
