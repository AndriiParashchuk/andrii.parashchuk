package com.java.class24;

public class HW24Task1 {
    public static void main(String[] args) {

        int[] num = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        int[] duplicates = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    //System.out.println(num[i]);
                }
            }
        }
    }
}
