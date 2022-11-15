package com.java.class23;
/*2. Write a program to find all duplicates number from the array
(Implement this program to get unique numbers in the output)
Example
Input : 23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35
Output : Duplicate numbers - 23, 44, 35
 */

public class HW23Task2 {
    public static void main(String[] args) {

        int[] num = {23, 44, 21, 23, 23, 35, 35, 23, 23, 44, 35};
        int[] duplicates = new int[num.length];

        for (int i = 0; i < num.length; i++) {
            for (int j = i + 1; j < num.length; j++) {
                if (num[i] == num[j]) {
                    //System.out.println(num[i]);
                }
            }
//            if (count == 1) {
//                System.out.print(num[i] + " ");
//            }
//            count = 0;
        }
    }

//    static boolean isDuplicateNumberPrint(int duplicates, int num[]) {
////        for (int data : duplicates) {
////            if (data == num[]){
////                return true;
////            }
////      }
    //}


}