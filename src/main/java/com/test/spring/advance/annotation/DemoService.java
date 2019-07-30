package com.test.spring.advance.annotation;

import org.springframework.stereotype.Service;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
@Service
public class DemoService {
    public DemoService() {
        System.out.println("from annotation get bean");
    }
}
