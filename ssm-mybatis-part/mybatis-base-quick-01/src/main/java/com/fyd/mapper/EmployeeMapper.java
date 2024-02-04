package com.fyd.mapper;

import com.fyd.pojo.Employee;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/4  21:56
 * Description: 规定数据库方法即可
 */
public interface EmployeeMapper {

    Employee queryById(Integer id);

    int deleteById(Integer id);
}
