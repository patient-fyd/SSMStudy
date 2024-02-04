package com.fyd.test;

import com.fyd.mapper.EmployeeMapper;
import com.fyd.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/4  22:18
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
        // 4. 获取接口的代理对象 调用代理对象方法，就会查找mapper接口方法
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Employee employee = mapper.queryById(1);
        System.out.println("employee = " + employee);
        // 5. 提交事务和释放资源
        sqlSession.commit();
        sqlSession.close();
    }
}
