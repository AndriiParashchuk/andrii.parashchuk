package com.java.class22;
/*2. Write a program to find greatest number from an array
Example
Input : 23, 44, 21, 56, 27, 35, 75, 34, 25
Output : Maximum - 75
 */

public class HW22Task2 {
    public static void main(String[] args) {
        int greatest = 0;
        int num[] = {23, 44, 21, 56, 27, 35, 75, 34, 25};
        int max = 0;
        for (int i = 0; i < num.length; i++) {
            if (num[i] > max) {
                max = num[i];
            }
        }
        System.out.println("Maximum - " + max);
    }
}
