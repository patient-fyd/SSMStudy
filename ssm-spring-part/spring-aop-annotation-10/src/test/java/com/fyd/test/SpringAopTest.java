package com.fyd.test;

import com.fyd.config.JavaConfig;
import com.fyd.service.Calculator;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/3  22:36
 * Description:
 */
@SpringJUnitConfig(value = JavaConfig.class)
public class SpringAopTest {

    // aop底层是jdk代理，代理对象和目标对象是兄弟关系，必须要接口接值
    @Autowired
    private Calculator calculator;

    @Test
    public void test1(){
        int add = calculator.add(1,2);
        System.out.println("add = " + add);
    }
}
