package com.test.spring.el;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @author pnc
 * @date 2019-07-28.
 */
@Service
public class DemoService {
    @Value("another class attribute")
    private String another;

    public String getAnother() {
        return another;
    }

    public void setAnother(String another) {
        this.another = another;
    }
}
