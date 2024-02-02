package com.fyd.ioc;

import com.fyd.controller.StudentController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  17:19
 * Description:
 */
public class SpringIoCTest {
    @Test
    public void test(){
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        StudentController studentController = applicationContext.getBean(StudentController.class);
        studentController.findAll();
    }
}
