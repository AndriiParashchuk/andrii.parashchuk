package com.java.class19;

public class Training09 {
    public static void main(String[] args) {

        for (int row = 1; row <= 5; row++) {

            for (int space = 1; space <= 5 - row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <= row * 2 - 1; col++) {
                System.out.print(col);
            }

            System.out.println();
        }
        for (int row = 1; row <= 4; row++) {
            for (int space = 1; space <= row; space++) {
                System.out.print(" ");
            }
            for (int col = 1; col <=9 - 2*row; col++){
                System.out.print(col);
            }
            System.out.println();

        }


    }
}
