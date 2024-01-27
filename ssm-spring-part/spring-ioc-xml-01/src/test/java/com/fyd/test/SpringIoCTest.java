package com.fyd.test;

import com.fyd.ioc_03.A;
import com.fyd.ioc_03.HappyComponent;
import org.junit.jupiter.api.Test;
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
    @Test
    public void getBeanFromIoC() {
        // 1. 创建ioc容器对象
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext();
        applicationContext.setConfigLocations("spring-03.xml");
        applicationContext.refresh();

        // 2. 从容器中获取组件
        // 2.1 获取指定id的组件
        HappyComponent happyComponent = (HappyComponent) applicationContext.getBean("happyComponent");

        // 2.2 根据beanID,同时指定bean的类型
        HappyComponent happyComponent1 = applicationContext.getBean("happyComponent", HappyComponent.class);

        // 3. 直接根据类型获取
        //根据类型获取,但是要求,同类型(当前类,或者之类,或者接口的实现类)只能有一个对象交给IoC容器管理
        // 可以根据接口类型获取值
        A a = applicationContext.getBean(A.class);
        //HappyComponent happyComponent2 = applicationContext.getBean(HappyComponent.class);

        a.doWork();
    }
}
