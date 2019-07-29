package com.test.spring.basis.profile;

/**
 * @Author pnc
 * @Date 2019-07-29
 **/
public class DemoBean {
    private String content;
    public DemoBean(String content) {
        super();
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
