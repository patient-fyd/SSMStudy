package com.fyd.ioc_02;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/2  15:07
 * Description:
 */
@Scope(scopeName = ConfigurableBeanFactory.SCOPE_SINGLETON)
@Component
public class JavaBean {

    @PostConstruct
    public void init(){
        System.out.println("JavaBean.init");
    }

    @PreDestroy
    public void destroy(){
        System.out.println("JavaBean.destroy");
    }
}
