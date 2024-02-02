package com.fyd.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  20:13
 * Description:
 */
@Configuration
@ComponentScan("com.fyd")
@PropertySource("classpath:jdbc.properties")
public class JavaConfig {

    @Bean
    public DataSource dataSource(@Value("${fyd.url}") String url,
                                 @Value("${fyd.driver}") String driver,
                                 @Value("${fyd.username}") String username,
                                 @Value("${fyd.password}") String password){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(driver);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return new JdbcTemplate(dataSource);
    }
}
