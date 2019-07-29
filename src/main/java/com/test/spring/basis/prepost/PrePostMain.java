package com.test.spring.basis.prepost;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author pnc
 * @Date 2019-07-29
 **/
public class PrePostMain {
    public static void main(String []args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(PrePostConfig.class);
        BeanWayService beanWayService = context.getBean(BeanWayService.class);

        JSR250WayService jsr250WayService = context.getBean(JSR250WayService.class);

        context.close();
    }
}
