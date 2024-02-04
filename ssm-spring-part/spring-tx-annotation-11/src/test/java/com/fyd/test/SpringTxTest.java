package com.fyd.test;

import com.fyd.config.JavaConfig;
import com.fyd.service.StudentService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/4  17:32
 * Description:
 */
@SpringJUnitConfig(JavaConfig.class)
public class SpringTxTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void test(){
        studentService.changeInfo();
    }
}