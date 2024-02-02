package com.fyd.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  17:30
 * Description: java的配置类，替代xml配置文件
 *      1. 包扫描注解配置
 *      2. 引用外部的配置文件
 *      3. 声明第三方依赖的bean组件
 */
@ComponentScan({"com.fyd"})
@PropertySource("jdbc.properties")
@Configuration
public class JavaConfiguration {

    @Value("${jdbc.url}")
    private String url;
    @Value("${jdbc.driverClassName}")
    private String drier;
    @Value("${jdbc.username}")
    private String username;
    @Value("${jdbc.password}")
    private String password;


    @Scope(scopeName = "prototype")
    @Bean
    public DruidDataSource dataSource(){
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setUrl(url);
        dataSource.setDriverClassName(drier);
        dataSource.setUsername(username);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate(DataSource dataSource){
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource);
        return jdbcTemplate;
    }
}
