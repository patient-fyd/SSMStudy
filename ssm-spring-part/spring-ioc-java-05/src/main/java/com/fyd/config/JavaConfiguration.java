package com.fyd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

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
}
