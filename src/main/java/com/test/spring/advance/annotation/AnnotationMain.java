package com.test.spring.advance.annotation;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
public class AnnotationMain {
    public static void main(String []args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DemoConfig.class);
        context.getBean(DemoService.class);
        context.close();
    }
}
