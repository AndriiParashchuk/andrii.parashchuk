package com.java.class13;

public class practiceMethods04 {
    public static void main(String[] args) {
        int a = 10;
        a = changeValue(a);
        System.out.println(a);
    }

    static int changeValue(int a){
        a = a + 5;
        return a;
    }
}
