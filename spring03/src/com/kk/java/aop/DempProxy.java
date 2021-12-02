package com.kk.java.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DempProxy {

    //前置通知
    @Before(value="execution(public * com.kk.java.aop.Demo.demo(..))")
    public void before(JoinPoint joinPoint) {
        System.out.println("====="+joinPoint.getSignature().getName());
        System.out.println("before...");
    }

    //最终通知
    @After(value="execution(void com.kk.java.aop.Demo.*())")
    public void after() {
        System.out.println("after...");
    }

    //后置通知
    @AfterReturning(value="execution(void com.kk.java.aop.Demo.*())", returning="result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        System.out.println("after...");
    }

    //异常通知
    @AfterThrowing(value="execution(void com.kk.java.aop.Demo.*())", throwing="ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        System.out.println("after...");
    }

    @Around(value = "execution(* * com.kk.java.aop.Demo.*(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) {

    }

}
