package com.fyd.ioc_03;

import org.springframework.stereotype.Service;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  15:31
 * Description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Override
    public void show() {
        System.out.println("show");
    }
}
