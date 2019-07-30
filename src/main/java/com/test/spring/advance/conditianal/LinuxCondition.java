package com.test.spring.advance.conditianal;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * @Author pnc
 * @Date 2019-07-30
 **/
public class LinuxCondition implements Condition {
    @Override
    public boolean matches(ConditionContext conditionContext, AnnotatedTypeMetadata annotatedTypeMetadata) {
        // Mac OS or Linux
        return conditionContext.getEnvironment().getProperty("os.name").contains("ac");
    }
}
