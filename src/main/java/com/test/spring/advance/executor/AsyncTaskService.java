package com.test.spring.advance.executor;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author pnc
 * @date 2019-07-29.
 */
@Service
public class AsyncTaskService {

    @Async
    public void executeAsyncTask(Integer index) {
        System.out.println("task execute async index:" + index);
    }

    @Async
    public void executeAsyncTaskPlus(Integer index) {
        System.out.println("task execute async index plus:" + (index + 1));
    }
}
