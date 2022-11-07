package com.java.class13;

public class practiceMethods02 {
    public static void main(String[] args) {
        printValue(getSqureOfNumber(10));
    }

    static int getSqureOfNumber(int a){
        return getMultiplication(a, a);
    }

    static int getMultiplication(int a, int b){
        return a * b;
    }

    static void printValue(int num){
        System.out.println(num);
    }
}
