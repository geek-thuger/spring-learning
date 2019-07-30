package com.test.spring.advance.conditianal;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
public class ConditionMain {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditianalConfig.class);
        ListService listService = context.getBean(ListService.class);
        System.out.println("cur sys name:" + context.getEnvironment().getProperty("os.name") + "cmd:" + listService.showCmd());
        context.close();
    }
}
