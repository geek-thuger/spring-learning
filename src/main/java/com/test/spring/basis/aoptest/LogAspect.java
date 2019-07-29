package com.test.spring.basis.aoptest;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * @author pnc
 * @date 2019-07-28.
 */
@Aspect
@Component
public class LogAspect {
    @Pointcut(value = "@annotation(com.test.spring.basis.aoptest.Action)")
    public void annotationPointCut(){};

    @After("annotationPointCut()")
    public void after(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature) joinPoint.getSignature();
    Method method = signature.getMethod();
    Action action = method.getAnnotation(Action.class);
    System.out.println("annotation: "+action.name());
    }

    @Before("execution(* com.test.spring.basis.aoptest.DemoMethodService.*(..))")
    public void before(JoinPoint joinPoint) {
    MethodSignature signature = (MethodSignature)joinPoint.getSignature();
    Method method = signature.getMethod();
    System.out.println("methods: " + method.getName());
    }

}
