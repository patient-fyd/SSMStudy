package com.fyd.test;

import com.fyd.mapper.EmployeeMapper;
import com.fyd.mapper.TeacherMapper;
import com.fyd.pojo.Employee;
import com.fyd.pojo.Teacher;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

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

    @Test
    public void test_02() throws IOException {
        // 1. 读取外部配置文件（mybatis-config.xml）
        InputStream ips = Resources.getResourceAsStream("mybatis-config.xml");
        // 2. 创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(ips);
        // 3. 创建sqlSession对象
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 4. 获取代理对象
        TeacherMapper mapper = sqlSession.getMapper(TeacherMapper.class);

        Teacher teacher = new Teacher();
        teacher.settName("王五");
        // 自己维护非自增主键
//        String id = UUID.randomUUID().toString().replaceAll("-", "");
//        teacher.settId(id);

        int rows = mapper.insertTeacher(teacher);
        System.out.println("rows = " + rows);

        sqlSession.commit();
        sqlSession.close();
    }
}
