package com.kk.java.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Component
@Aspect
public class DempProxy {

    //前置通知
    @Before("execution(public * com.kk.java.aop.Demo.demo(..))")
    public void before() {
        System.out.println("before...");
    }

    //最终通知
    @After("execution(void com.kk.java.aop.Demo.*())")
    public void after() {
        System.out.println("after...");
    }

}
