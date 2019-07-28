package com.test.spring.javaConfig;

/**
 * @author pnc
 * @date 2019-07-28.
 */
public class UseFunctionService {
    /** 将FunctionService的实体Bean注入到UseFunctionService中，@Inject or @Resource*/

    FunctionService functionService;

    public void setFunctionService(FunctionService functionService) {
        this.functionService = functionService;
    }

    public String SayHello(String word) {
        return functionService.sayHello(word);
    }
}
