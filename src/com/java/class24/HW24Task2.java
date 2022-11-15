package com.java.class24;

public class HW24Task2 {
    public static void main(String[] args) {


        int info[][] = {{23, 44, 21},
                        {45, 42, 31},
                        {73, 14, 0}
        };

        for (int i = 0; i < info.length; i++) {
            int sum =0;
            for (int j = 0; j < info.length; j++) {
                sum= sum + info[j][i];
            }
            System.out.println("Sum of column "+i+" is "+ sum);

        }


    }
}
