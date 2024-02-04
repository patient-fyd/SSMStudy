package com.fyd.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/4  11:16
 * Description: 普通方式进行事务的添加
 */
@Component
@Aspect
@Order(1) // 优先级,数值越小，优先级越高
public class TxAdvice {

    @Before("com.fyd.pointcut.MyPointCut.log()")
    public void begin(){
        System.out.println("开始事务");
    }

    @AfterReturning("com.fyd.pointcut.MyPointCut.log()")
    public void commit(){
        System.out.println("事务提交");
    }

    @AfterThrowing("com.fyd.pointcut.MyPointCut.log()")
    public void rollback(){
        System.out.println("事务回滚");
    }
}
