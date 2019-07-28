package com.test.spring.scope;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

/**
 * @author pnc
 * @date 2019-07-28.
 */
@Service
@Scope("prototype")
public class DemoPrototypeService {
}
