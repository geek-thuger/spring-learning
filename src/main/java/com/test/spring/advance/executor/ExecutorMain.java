package com.test.spring.advance.executor;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pnc
 * @date 2019-07-29.
 */
public class ExecutorMain {
    public static void main(String []args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskService asyncTaskService = context.getBean(AsyncTaskService.class);
        for (int i=0; i < 10 ; i++) {
            asyncTaskService.executeAsyncTask(i);
            asyncTaskService.executeAsyncTaskPlus(i);
        }
        context.close();
    }
}
