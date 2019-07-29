package com.test.spring.basis.aoptest;

import java.lang.annotation.*;

/**
 * @author pnc
 * @date 2019-07-28.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Action {
    String name();
}
