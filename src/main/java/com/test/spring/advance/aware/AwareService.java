package com.test.spring.advance.aware;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.nio.charset.Charset;

/**
 * @author pnc
 * @date 2019-07-29.
 */
@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {
    private String name;
    private ResourceLoader resourceLoader;

    @Override public void setBeanName(String name) {
        this.name = name;
    }

    @Override public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void outPut() {
        System.out.println("Bean name:" + name);

        Resource resource = resourceLoader.getResource("classpath:com/test/spring/basis/resource/test.txt");
        try {
            System.out.println("test.txt file contents:" +  IOUtils.toString(resource.getInputStream(), Charset.defaultCharset()));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
