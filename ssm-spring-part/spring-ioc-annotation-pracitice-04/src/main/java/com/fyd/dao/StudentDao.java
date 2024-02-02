package com.fyd.dao;

import com.fyd.pojo.Student;

import java.util.List;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  17:07
 * Description:
 */
public interface StudentDao {
    List<Student> queryAll();
}
