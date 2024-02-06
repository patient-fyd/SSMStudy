package com.fyd.mapper;

import com.fyd.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/5  18:35
 * Description:
 */
public interface EmployeeMapper {

    Employee queryById(Integer id);

    int deleteById(Integer id);

    List<Employee> queryBySalary(Double salary);

    int insertEmp(Employee employee);

    List<Employee> queryByNameAndSalary(@Param("name") String name, @Param("salary") Double salary);
}
