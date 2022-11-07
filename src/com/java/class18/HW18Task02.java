package com.java.class18;

public class HW18Task02 {
    public static void main(String[] args) {
        int magic = 0;
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 5 == 4 && i % 4 == 3 && i % 3 == 2 && i % 2 == 1) {
                    magic = i;
                }
            }
        }
        System.out.println("Magic number is: " + magic);
    }

}
