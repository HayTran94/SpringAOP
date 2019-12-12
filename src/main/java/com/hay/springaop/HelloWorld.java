package com.hay.springaop;

/**
 *
 * @author haytran
 */
public class HelloWorld {

    public void method1() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("method 1");
    }

    public void method2() {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("method 2");
    }

    public void method3() throws Exception {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("method 3");
        throw new Exception();
    }

    public int fullCase(int a, int b) {
        System.out.println("+++++++++++++++++++++++++++++++");
        System.out.println("method fullCase");
        return a + b;
    }

}
