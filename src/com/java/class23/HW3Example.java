package com.java.class23;

public class HW3Example {
    public static void main(String[] args) {

        int[] num = {23, 44, 21, 23, 27, 35, 75, 44, 25};
        //System.out.println(" " + " ");
        for (int i = 0; i < num.length - 1; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.print(num[i] + " ");
                }
            }
        }

    }
}
