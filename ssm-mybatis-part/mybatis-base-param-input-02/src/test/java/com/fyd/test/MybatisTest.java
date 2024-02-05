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
 * Date: 2024/2/5  19:01
 * Description:
 */
public class MybatisTest {

    @Test
    public void test_01() throws IOException {
        // 读取外部配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        // 创建sqlSessionFactory
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        // 获取sqlsession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        // 获取mapper
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.queryById(1);
        System.out.println("employee = " + employee);
        // 关闭资源
        sqlSession.close();
    }
}
