package com.java.class23;

public class HW23Task1 {
    public static void main(String[] args) {

        int num[][] = {{11, 22, 33,}, {44, 55, 66,}, {77, 88, 99,}};

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }


    }
}
