package com.jun.mqttx.service.impl;

import com.jun.mqttx.service.IAuthenticationService;
import org.springframework.stereotype.Component;

/**
 * 认证服务
 *
 * @author Jun
 * @date 2020-03-04 12:44
 */
@Component
public class AuthenticationServiceImpl implements IAuthenticationService {

    @Override
    public void authenticate(String username, byte[] password) {
        //do nothing
    }
}
