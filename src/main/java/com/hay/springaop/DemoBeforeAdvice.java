package com.hay.springaop;

import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author haytran
 */
public class DemoBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("before method: " + method.getName());
    }
    
}
