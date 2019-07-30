package com.test.spring.advance.scheduletask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
@Service
public class ScheduledTaskService {
    private static final SimpleDateFormat dateFormate = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reportCurrentTime() {
        System.out.println("every five second execute:" + dateFormate.format(new Date()));
    }

    @Scheduled(cron = "0 26 11 ? * *")
    public void fixTimeExecution() {
        System.out.println("execute at fixed time:" + dateFormate.format(new Date()));
    }
}
