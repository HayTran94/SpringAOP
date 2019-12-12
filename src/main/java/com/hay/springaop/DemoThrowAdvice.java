package com.hay.springaop;

import java.lang.reflect.Method;
import org.springframework.aop.ThrowsAdvice;

/**
 *
 * @author haytran
 */
public class DemoThrowAdvice implements ThrowsAdvice {

    public void afterThrowing(Method m, Object args[], Object target, Exception e) {
        System.out.println("afterThrowing: " + m.getName());
    }

}
