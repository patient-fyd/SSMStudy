package com.fyd.mapper;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/6  18:08
 * Description:
 */
public interface EmployeeMapper {

    int deleteById(Integer Id);

    String queryNameById(Integer Id);

    Double querySalaryById(Integer Id);
}
