package com.java.class15;

public class HW15Task3 {
    public static void main(String[] args) {

        int result = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                result = result - i;
                continue;
            }
            result = result + i;
        }
        System.out.println(result);
    }
}
