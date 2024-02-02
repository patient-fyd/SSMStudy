package com.fyd.service.serviceImpl;

import com.fyd.dao.StudentDao;
import com.fyd.pojo.Student;
import com.fyd.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  17:11
 * Description:
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;
    @Override
    public List<Student> findAll() {
        List<Student> students = studentDao.queryAll();
        return students;
    }
}
