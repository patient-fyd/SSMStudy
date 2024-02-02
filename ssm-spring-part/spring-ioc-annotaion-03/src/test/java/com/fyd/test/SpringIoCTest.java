package com.fyd.test;

import com.fyd.ioc_01.XxxDao;
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
}
