package com.hay.springaop;

import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author haytran
 */
public class DemoAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
        System.out.println("afterReturning: " + method.getName());
    }
    
}
