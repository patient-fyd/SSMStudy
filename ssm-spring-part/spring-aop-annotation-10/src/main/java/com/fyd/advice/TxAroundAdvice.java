package com.fyd.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Author: patient.fyd@gmail.com
 * Date: 2024/2/4  11:37
 * Description:
 */
@Component
@Aspect
public class TxAroundAdvice {

    /**
     * 环绕通知需要你在通知中，定义目标方法的执行
     * @param pjp 目标方法（获取目标方法信息）
     * @return
     */
    @Around("com.fyd.pointcut.MyPointCut.log()")
    public Object transaction(ProceedingJoinPoint pjp){
        Object[] args = pjp.getArgs();
        Object result = null;
        try {
            System.out.println("开启事务");
            result = pjp.proceed(args);
            System.out.println("结束事务");
        } catch (Throwable e) {
            System.out.println("回滚事务");
            throw new RuntimeException(e);
        } finally {

        }
        return result;
    }
}
