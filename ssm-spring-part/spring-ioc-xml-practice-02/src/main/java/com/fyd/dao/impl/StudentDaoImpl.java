package com.fyd.dao.impl;

import com.fyd.dao.StudentDao;
import com.fyd.pojo.Student;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/1  22:13
 * Description:
 */
public class StudentDaoImpl implements StudentDao {
    private JdbcTemplate jdbcTemplate;
    public void setJdbcTemplate(JdbcTemplate jdbcTemplate){
        this.jdbcTemplate = jdbcTemplate;
    }
    @Override
    public List<Student> queryAll() {
        String sql = "select id,name,gender,age,class as classes from students";
        List<Student> students = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Student.class));
        System.out.println("studentDao = " + students);
        return students;
    }
}
