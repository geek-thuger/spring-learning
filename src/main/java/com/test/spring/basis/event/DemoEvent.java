package com.test.spring.basis.event;

import com.test.spring.basis.profile.DemoBean;
import org.springframework.context.ApplicationEvent;

/**
 * @Author pnc
 * @Date 2019-07-29
 **/
public class DemoEvent extends ApplicationEvent {
    private static final long serialVersionUID = 1L;
    private String msg;

    public DemoEvent(Object source, String msg) {
        super(source);
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
