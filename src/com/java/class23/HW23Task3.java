package com.java.class23;
/*3. Program to sort the elements of an array in ascending order
(Tricky, do enough brainstorming before solving)
Example
Input : 5, 2, 8, 7, 3, 6
Output : Duplicate numbers - 2, 3, 5, 6, 7, 8
 */

public class HW23Task3 {
    public static void main(String[] args) {

        int num[] = {5, 2, 8, 7, 3, 6};
        int max = 0;
        for (int i : num) {
            if (i > max) {
                max = i;
            }
        }
        int sort[] = new int[max + 1];
        for (int data : num) {
            sort[data] = data;

        }

        for (int a : sort) {
            if (!(a == 0)) {
                System.out.print(a + " ");
            }
        }
    }
}
