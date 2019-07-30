package com.test.spring.advance.scheduletask;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
public class ScheduledTaskMain {
    public static void main(String args[]) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScheduledTaskConfig.class);
        ScheduledTaskService scheduledTaskService = context.getBean(ScheduledTaskService.class);
//        scheduledTaskService.reportCurrentTime();
//        scheduledTaskService.fixTimeExecution();
//        context.close();
    }
}
