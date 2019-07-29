package com.test.spring.advance.aware;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pnc
 * @date 2019-07-29.
 */
public class AwareMain {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
        AwareService awareService = context.getBean(AwareService.class);
        awareService.outPut();
        context.close();
    }
}
