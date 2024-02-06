package com.fyd.test;

import com.fyd.mapper.EmployeeMapper;
import com.fyd.pojo.Employee;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/6  21:24
 * Description:
 */
public class MybatisTest {
    @Test
    public void test_01() throws IOException {
        // 1. 读取外部配置文件（mybatis-config.xml）
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");
        // 2. 创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
        // 3. 创建sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4. 获取代理对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);

        Employee employee = new Employee();
        employee.setEmpName("张三");
        employee.setEmpSalary(5000.0);

        int rows = mapper.insertEmp(employee);
        System.out.println("rows = " + rows);

        sqlSession.commit();
        sqlSession.close();
    }
}
