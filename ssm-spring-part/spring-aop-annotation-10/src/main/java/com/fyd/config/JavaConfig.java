package com.fyd.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/3  22:35
 * Description:
 */
@Configuration
@ComponentScan("com.fyd")
@EnableAspectJAutoProxy
public class JavaConfig {
}
