package com.fyd.service.ServiceImpl;

import com.fyd.dao.StudentDao;
import com.fyd.pojo.Student;
import com.fyd.service.StudentService;

import java.util.List;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/1  22:19
 * Description:
 */
public class StudentServiceImpl implements StudentService {
    private StudentDao studentDao;
    public void setStudentDao(StudentDao studentDao){
        this.studentDao = studentDao;
    }
    @Override
    public List<Student> findAll() {
        List<Student> studentList = studentDao.queryAll();
        System.out.println("studentService = " + studentList);
        return studentList;
    }
}
