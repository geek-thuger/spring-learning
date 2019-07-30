package com.test.spring.advance.conditianal;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
@Configuration
public class ConditianalConfig {
    @Bean
    @Conditional(WindowsCondition.class)
    public ListService WindowService() {
        return new WindowsListService();
    }

    @Bean
    @Conditional(LinuxCondition.class)
    public ListService LinuxService() {
        return new LinuxListService();
    }
}
