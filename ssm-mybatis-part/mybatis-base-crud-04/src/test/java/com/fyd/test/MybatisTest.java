package com.fyd.test;

import com.fyd.mapper.UserMapper;
import com.fyd.pojo.User;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/6  23:02
 * Description:
 */
public class MybatisTest {

    private SqlSession sqlSession;
    private UserMapper mapper;

    @BeforeEach // 每次走测试方法之前，先走的初始化方法
    public void before() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        sqlSession = sqlSessionFactory.openSession(true);// 开启自动提交
        mapper = sqlSession.getMapper(UserMapper.class);
    }

    @AfterEach
    public void clean(){
        sqlSession.close();
    }
    
    @Test
    public void testInsert(){
        User user = new User();
        user.setUsername("test");
        user.setPassword("123");
        
        int insert = mapper.insert(user);
        System.out.println("insert = " + insert);
    }
    
    @Test
    public void testUpdate(){
        User user = new User();
        user.setId(1);
        user.setUsername("test2");
        user.setPassword("111");

        int update = mapper.update(user);
        System.out.println("update = " + update);
    }
    
    @Test
    public void testDelete(){
        int delete = mapper.delete(1);
        System.out.println("delete = " + delete);
    }
    
    @Test
    public void testSelectById(){
        
    }
    
    @Test
    public void testSelectAll(){
        
    }
}
