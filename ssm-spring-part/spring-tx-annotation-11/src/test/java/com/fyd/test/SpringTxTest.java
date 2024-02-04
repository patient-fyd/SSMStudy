package com.fyd.test;

import com.fyd.config.JavaConfig;
import com.fyd.service.StudentService;
import com.fyd.service.TopService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.io.FileNotFoundException;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/4  17:32
 * Description:
 */
@SpringJUnitConfig(JavaConfig.class)
public class SpringTxTest {

    @Autowired
    private StudentService studentService;
    
    @Autowired
    private TopService topService;

    @Test
    public void test() throws FileNotFoundException {
        studentService.changeInfo();
    }

    @Test
    public void test2(){
        topService.topService();
    }
}
