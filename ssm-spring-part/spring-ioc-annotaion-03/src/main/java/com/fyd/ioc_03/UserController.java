package com.fyd.ioc_03;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  15:30
 * Description:
 */
@Controller
public class UserController {

    @Autowired
    @Qualifier("userServiceImpl") // 只能和AutoWired注解配合使用，当有多个对象的时候，@Qualifier 注解中指定的名称作为 bean 的id进行匹配
    // @Resource 等同于上面两个之和，Java提供的注解，还需要导入jakarta.annotation-api依赖
    private UserService userService;

    public void show(){
        userService.show();
    }
}
