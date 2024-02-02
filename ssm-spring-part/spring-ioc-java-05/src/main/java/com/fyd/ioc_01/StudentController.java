package com.fyd.ioc_01;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  17:28
 * Description:
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;
}
