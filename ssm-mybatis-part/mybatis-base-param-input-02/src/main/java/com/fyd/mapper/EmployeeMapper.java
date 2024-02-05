package com.fyd.mapper;

import com.fyd.pojo.Employee;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/5  18:35
 * Description:
 */
public interface EmployeeMapper {

    Employee queryById(Integer id);
}
