package com.fyd.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/1/27  17:25
 * Description: ioc容器创建和读取组件的测试类
 */
public class SpringIoCTest {
    /**
     * 如何创建ioc容器并且读取配置文件
     */
    public void createIoC() {
        // 创建容器 选择合适的容器实现即可
        //方式1:实例化并且指定配置文件
        //参数：String...locations 传入一个或者多个配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-03.xml");

        //方式2:先实例化，再指定配置文件，最后刷新容器触发Bean实例化动作 [springmvc源码和contextLoadListener源码方式]
        ClassPathXmlApplicationContext context1 = new ClassPathXmlApplicationContext();
        //设置配置配置文件,方法参数为可变参数,可以设置一个或者多个配置
        context1.setConfigLocations("spring-03.xml");
        //后配置的文件,需要调用refresh方法,触发刷新配置
        context1.refresh();

    }

    /**
     * 如何在IoC容器中获取组件Bean
     */
    public void getBeanFromIoC() {

    }
}
