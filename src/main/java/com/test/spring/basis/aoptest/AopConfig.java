package com.test.spring.basis.aoptest;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author pnc
 * @date 2019-07-28.
 */
@Configuration
@ComponentScan("com.test.spring.basis.aoptest")
@EnableAspectJAutoProxy
public class AopConfig {

}
