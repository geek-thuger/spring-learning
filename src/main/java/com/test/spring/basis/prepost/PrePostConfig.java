package com.test.spring.basis.prepost;

import org.springframework.context.annotation.Bean;

/**
 * @Author pnc
 * @Date 2019-07-29
 **/
public class PrePostConfig {
    @Bean(initMethod = "init", destroyMethod = "destroy")
    BeanWayService beanWayService() {
        return new BeanWayService();
    }

    @Bean
    JSR250WayService jsr250WayService() {
        return new JSR250WayService();
    }
}
