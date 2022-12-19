package com.java.class40;

public class ExceptionHandling {
    public static void main(String[] args) {
        method2();

    }
    public static void method2(){
        method1();
    }

    public static void method1() throws RuntimeException{
        System.out.println("Hello");
    }
}
