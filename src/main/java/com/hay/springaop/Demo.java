package com.hay.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author haytran
 */
public class Demo {

    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloProxy");
        helloWorld.method1();
        System.out.println("\n");
        helloWorld.method2();
        System.out.println("\n");
        helloWorld.method3();
    }
}
