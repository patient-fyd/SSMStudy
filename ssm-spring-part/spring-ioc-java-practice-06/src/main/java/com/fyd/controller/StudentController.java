package com.fyd.controller;

import com.fyd.pojo.Student;
import com.fyd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  17:13
 * Description:
 */
@Controller
public class StudentController {

    @Autowired
    private StudentService studentService;

    public void findAll(){
        List< Student> students = studentService.findAll();
        System.out.println("students = " + students);
    }
}
