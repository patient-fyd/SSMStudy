package com.fyd.advice;

import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/3  22:39
 * Description: 增强类
 */
@Component
@Aspect
@Order(2)
public class LogAdvice {

    @Before("com.fyd.pointcut.MyPointCut.log()")
    public void start() {
        System.out.println("方法开始了");
    }

    @After("com.fyd.pointcut.MyPointCut.log()")
    public void end() {
        System.out.println("方法结束了");
    }

    @AfterThrowing("com.fyd.pointcut.MyPointCut.log()")
    public void exception() {
        System.out.println("方法出现异常了");
    }
}
