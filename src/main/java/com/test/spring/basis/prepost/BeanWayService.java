package com.test.spring.basis.prepost;

/**
 * @Author pnc
 * @Date 2019-07-29
 **/
public class BeanWayService {
    public void init() {
        System.out.println("@Bean-init-method");
    }

    public BeanWayService() {
        super();
        System.out.println("constructor-BeanWayService");
    }

    public void destroy() {
        System.out.println("@Bean-destroy-method");
    }
}
