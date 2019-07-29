package com.test.spring.basis.profile;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author pnc
 * @Date 2019-07-29
 **/
public class ProfileMain {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("prod");
        context.register(ProfileConfig.class);
        context.register();

        DemoBean demoBean = context.getBean(DemoBean.class);

        System.out.println(demoBean.getContent());

        context.close();
    }
}
