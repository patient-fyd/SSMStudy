package com.fyd.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/3  22:56
 * Description: 定义四个增强方法，获取目标方法的信息，返回值，异常对象
 */
@Component
@Aspect
public class MyAdvice {

    @Before("com.fyd.pointcut.MyPointCut.mypc()")
    public void before(JoinPoint joinPoint){
        // 获取方法属于类的信息
        String simpleName = joinPoint.getTarget().getClass().getSimpleName();
        // 获取方法名称
        String methodName = joinPoint.getSignature().getName();
        // 获取参数列表
        Object[] args = joinPoint.getArgs();
    }

    @AfterReturning(value = "com.fyd.pointcut.MyPointCut.mypc()", returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result){

    }

    @After("com.fyd.pointcut.MyPointCut.mypc()")
    public void after(JoinPoint joinPoint){
        System.out.println("后置通知");
    }

    @AfterThrowing(value = "com.fyd.pointcut.MyPointCut.mypc()", throwing = "throwable")
    public void afterThrowing(JoinPoint joinPoint,Throwable throwable){
        System.out.println("异常通知");
    }
}
