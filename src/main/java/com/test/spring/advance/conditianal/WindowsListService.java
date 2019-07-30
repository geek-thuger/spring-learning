package com.test.spring.advance.conditianal;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
public class WindowsListService implements ListService {
    @Override
    public String showCmd() {
        return "dir";
    }
}
