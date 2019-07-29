package com.test.spring.basis.prepost;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author pnc
 * @Date 2019-07-29
 **/
public class JSR250WayService {
    @PostConstruct
    public void init(){
        System.out.println("JSR250-init-method");
    }

    public JSR250WayService() {
        super();
        System.out.println("jsr250-constructor");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("jsr250-destroy");
    }
}
