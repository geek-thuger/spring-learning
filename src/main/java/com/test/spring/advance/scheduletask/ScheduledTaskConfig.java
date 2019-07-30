package com.test.spring.advance.scheduletask;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
@Configuration
@ComponentScan("com.test.spring.advance.scheduletask")
@EnableScheduling
public class ScheduledTaskConfig {
}
