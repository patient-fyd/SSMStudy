package com.fyd.advice;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/3  22:39
 * Description: 增强类
 */
@Component
@Aspect
public class LogAdvice {

    @Before("execution(* com.fyd.service.impl.*.*(..))")
    public void start() {
        System.out.println("方法开始了");
    }

    @After("execution(* com.fyd.service.impl.*.*(..))")
    public void end() {
        System.out.println("方法结束了");
    }

    @AfterThrowing("execution(* com.fyd.service.impl.*.*(..))")
    public void exception() {
        System.out.println("方法出现异常了");
    }
}
