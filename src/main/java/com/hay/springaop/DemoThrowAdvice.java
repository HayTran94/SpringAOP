package com.hay.springaop;

import com.google.gson.GsonBuilder;
import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;

/**
 *
 * @author haytran
 */
public class DemoThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Method method, Object args[], Object target, Exception e) {
        System.out.println("afterThrowing: " + method.getName() + "args: " + toString(args) + ", target: " + toString(target) + ", e: " + toString(e));

    }

    public String toString(Object o) {
        return new GsonBuilder().create().toJson(o);
    }
}
