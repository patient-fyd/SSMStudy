package com.fyd.dao;

import com.fyd.pojo.Student;

import java.util.List;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/1  22:12
 * Description: 数据层的接口
 */
public interface StudentDao {

    List<Student> queryAll();
}
