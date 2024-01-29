package com.fyd.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.fyd.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/1/29  14:13
 * Description: 测试javaTemplate如何使用
 */
public class JdbcTemplateTest {

    /**
     * JdbcTemplate简化数据库的crud 不提供连接池
     * DruidDataSource 负责连接的创建和数据库驱动的注册等等
     */
    public  void testForJava(){

        // 0. 创建一个连接池对象
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl("jdbc:mysql:///studb");
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUsername("root");
        dataSource.setPassword("111111");

        // 1. 实例化对象即可
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);

        // 2. 调用方法即可
    }

    /**
     * 通过ioc容器读取配置的JdbcTemplate组件
     */
    @Test
    public void testForIoC(){
        // 1. 创建ioc容器
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring-01.xml");
        // 2. 获取jdbcTemplate
        JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);
        // 3. 进行数据库crud
        // 3.1 插入 删除 修改 DML
        String sql = "insert into students (name,gender,age,class) values(?,?,?,?)";
        int rows = jdbcTemplate.update("sql", "张三","男",18,"三年级二班");
        System.out.println("rows = " + rows);
        // 3.2 查询 DQL
        sql = "select * from students where id = ?";
        jdbcTemplate.queryForObject(sql, (resultSet,  i) -> {
                Student student = new Student();
                student.setId(resultSet.getInt("id"));
                student.setName(resultSet.getString("name"));
                student.setGender(resultSet.getString("gender"));
                student.setAge(resultSet.getInt("age"));
                student.setClasses(resultSet.getString("classes"));
                return student;
        }, 1);
    }
}
