package com.test.spring.basis.scope;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author pnc
 * @date 2019-07-28.
 */
public class ScopeMain {
    public static void main (String [] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ScopeConfig.class);
        DemonSingletonService singletonService1 = context.getBean(DemonSingletonService.class);
        DemonSingletonService singletonService2 = context.getBean(DemonSingletonService.class);

        DemoPrototypeService prototypeService1 = context.getBean(DemoPrototypeService.class);
        DemoPrototypeService prototypeService2 = context.getBean(DemoPrototypeService.class);

        System.out.println("singleton equal:" + singletonService1.equals(singletonService2));
        System.out.println("prototype equal:" + prototypeService1.equals(prototypeService2));

        context.close();
    }
}
