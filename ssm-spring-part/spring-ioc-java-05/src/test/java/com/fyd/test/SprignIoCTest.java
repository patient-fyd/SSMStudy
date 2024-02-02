package com.fyd.test;

import com.fyd.config.JavaConfiguration;
import com.fyd.ioc_01.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  17:34
 * Description:
 */
public class SprignIoCTest {
    @Test
    public void test(){
        // 1. 创建ioc容器
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfiguration.class);

        StudentController bean = applicationContext.getBean(StudentController.class);
        System.out.println("bean = " + bean);
    }
}
