package com.fyd.test;

import com.fyd.ioc_01.XxxDao;
import com.fyd.ioc_03.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  14:51
 * Description:
 */
public class SpringIoCTest {
    @Test
    public void testIoC_01(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-01.xml");

        XxxDao xxxDao = context.getBean(XxxDao.class);
        System.out.println("xxxDao = " + xxxDao);
        context.close();
    }

    @Test
    public void testIoC_03(){
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");
        UserController userController = context.getBean(UserController.class);
        userController.show();
    }
}
