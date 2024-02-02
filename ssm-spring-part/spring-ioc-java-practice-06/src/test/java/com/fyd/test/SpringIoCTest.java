package com.fyd.test;

import com.fyd.config.JavaConfig;
import com.fyd.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  20:21
 * Description:
 */
public class SpringIoCTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(JavaConfig.class);
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();
    }
}
