package com.java.class22;
/*3. Write a program to find all duplicates number from the array (Tricky, do enough brainstorm before solving)
Example
Input : 23, 44, 21, 23, 27, 35, 75, 44, 25
Output : Duplicate numbers - 23, 44
 */

public class HW22Task3 {
    public static void main(String[] args) {
        int[] num = {23, 44, 21, 23, 27, 35, 75, 44, 25};
        System.out.print("Duplicate numbers - ");

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    System.out.print(num[j] + " ");
                }
            }
        }


    }
}
