package com.java.class22;
/* 1. Write a program to find the sum of even and odd numbers
Example
Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
Output : Sum Of Even - 134, Sum Of Odd - 206
 */

public class HW22Task1 {
    public static void main(String[] args) {
        int num[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        int sumEven = 0, sumOdd = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                sumEven = sumEven + num[i];
            } else {
                sumOdd = sumOdd + num[i];
            }
        }
        System.out.println("Sum of even is " + sumEven + ", " + "Sum of odd is " + sumOdd);

    }
}
