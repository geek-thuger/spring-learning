package com.test.spring.advance.conditianal;

import org.springframework.stereotype.Service;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/

public class LinuxListService implements ListService {
    @Override
    public String showCmd() {
        return "ls";
    }
}
