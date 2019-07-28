package com.test.spring.aoptest;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pnc
 * @date 2019-07-28.
 */
public class AopTestMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);
        DemoAnnotationService demoAnnotationService = context.getBean(DemoAnnotationService.class);

        DemoMethodService demoMethodService = context.getBean(DemoMethodService.class);

        demoAnnotationService.add();

        demoMethodService.add();

        context.close();
    }
}
