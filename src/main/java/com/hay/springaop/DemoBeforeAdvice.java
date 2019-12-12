package com.hay.springaop;

import com.google.gson.GsonBuilder;
import java.lang.reflect.Method;
import org.springframework.aop.MethodBeforeAdvice;

/**
 *
 * @author haytran
 */
public class DemoBeforeAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] os, Object o) throws Throwable {
        System.out.println("before method: " + method.getName() + ", objects: " + toString(os) + ", object: " + toString(o));
    }

    public String toString(Object o) {
        return new GsonBuilder().create().toJson(o);
    }
}
