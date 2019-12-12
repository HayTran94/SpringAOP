package com.hay.springaop;

import com.google.gson.GsonBuilder;
import java.lang.reflect.Method;
import org.springframework.aop.AfterReturningAdvice;

/**
 *
 * @author haytran
 */
public class DemoAfterAdvice implements AfterReturningAdvice {

    @Override
    public void afterReturning(Object o, Method method, Object[] os, Object o1) throws Throwable {
        System.out.println("afterReturning: " + method.getName() + "object: " + toString(o) + ", os: " + toString(os) + ",o1: " + toString(o1));
    }
    
    public String toString(Object o ) {
       return new GsonBuilder().create().toJson(o);
    }

}
