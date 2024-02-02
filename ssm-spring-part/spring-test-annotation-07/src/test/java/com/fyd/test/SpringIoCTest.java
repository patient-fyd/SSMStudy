package com.fyd.test;

import com.fyd.components.A;
import com.fyd.components.B;
import com.fyd.config.JavaConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  20:37
 * Description:
 */
@SpringJUnitConfig(classes = JavaConfig.class)
public class SpringIoCTest {

    @Autowired
    private A a;
    @Autowired
    private B b;

    @Test
    public void test(){
        System.out.println(a);
    }
}
