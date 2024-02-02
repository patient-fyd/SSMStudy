package com.fyd.ioc_04;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  16:38
 * Description:
 */
@Component
public class JavaBean {

    // 直接赋值
    private String name = "zhangsan";

    // 注解赋值
    // 默认值 :xxx
    @Value("${jdbc.username:admin}")
    private String username;

    @Value("${jdbc.password}")
    private String password;


}
