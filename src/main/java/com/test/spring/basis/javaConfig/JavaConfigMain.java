package com.test.spring.basis.javaConfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pnc
 * @date 2019-07-28.
 */
public class JavaConfigMain {
    public static void main(String []args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(DiConfig.class);
        UseFunctionService useFunctionService = context.getBean(UseFunctionService.class);
        //
        System.out.println(useFunctionService.SayHello("java config test"));
        //
        context.close();
    }
}
