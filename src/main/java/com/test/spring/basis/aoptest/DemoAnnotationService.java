package com.test.spring.basis.aoptest;

import org.springframework.stereotype.Service;

/**
 * @author pnc
 * @date 2019-07-28.
 */
@Service
public class DemoAnnotationService {
    @Action(name="annotation point")
    public void add(){
        System.out.println("this is annotation add");
    }
}
