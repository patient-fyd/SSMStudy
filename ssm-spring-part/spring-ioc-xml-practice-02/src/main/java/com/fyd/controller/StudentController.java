package com.fyd.controller;

import com.fyd.pojo.Student;
import com.fyd.service.StudentService;

import java.util.List;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/1  22:22
 * Description:
 */
public class StudentController {
    private StudentService studentService;

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }

    public void findAll(){
        List<Student> all = studentService.findAll();
        System.out.println("最终学员数据 = " + all);
    }
}
