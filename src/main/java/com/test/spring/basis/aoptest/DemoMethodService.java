package com.test.spring.basis.aoptest;

import org.springframework.stereotype.Service;

/**
 * @author pnc
 * @date 2019-07-28.
 */
@Service
public class DemoMethodService {
    public void add(){
        System.out.println("this is DemoMethodService add");
    }
}
