package com.test.spring.basis.javaConfig;

import org.springframework.stereotype.Service;

/**
 * @author pnc
 * @date 2019-07-28.
 */
public class FunctionService {
    public String sayHello(String word) {
        return "Hello " + word + " !";
    }
}
