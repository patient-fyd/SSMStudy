package com.fyd.ioc_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  15:30
 * Description:
 */
@Controller
public class UserController {

    @Autowired
    private UserService userService;

    public void show(){
        userService.show();
    }
}
