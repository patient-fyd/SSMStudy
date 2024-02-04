package com.fyd.pointcut;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/4  11:10
 * Description:
 */
@Component
public class MyPointCut {
    /**
     * 切点表达式的提取和复用
     */
    @Pointcut("execution(* com.fyd.service.impl.*.*(..))")
    public void log() {
    }

    @Pointcut("execution(* com.fyd..impl.*.*(..))")
    public void mypc(){

    }
}
