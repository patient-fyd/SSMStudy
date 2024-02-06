package com.fyd.mapper;

import com.fyd.pojo.Employee;

import java.util.Map;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/6  18:08
 * Description:
 */
public interface EmployeeMapper {

    int deleteById(Integer Id);

    String queryNameById(Integer Id);

    Double querySalaryById(Integer Id);

    Employee queryById(Integer Id);

    Map<String,Object> selectEmpNameAndMaxSalary();
}
