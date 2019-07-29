package com.test.spring.basis.el;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pnc
 * @date 2019-07-28.
 */
public class ElMain {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ElConfig.class);
        ElConfig elConfig = context.getBean(ElConfig.class);
        elConfig.outPutResource();

        context.close();
    }
}
