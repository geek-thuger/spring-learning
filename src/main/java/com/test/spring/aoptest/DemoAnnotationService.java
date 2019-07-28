package com.test.spring.aoptest;

import org.springframework.stereotype.Service;

/**
 * @author pnc
 * @date 2019-07-28.
 */
@Service
public class DemoAnnotationService {
    @Action(name="注解式拦截add")
    public void add(){
        System.out.println("this is annotation add");
    }
}
