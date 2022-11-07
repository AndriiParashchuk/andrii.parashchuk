package com.java.class20;

// Write a program to take String from user using scanner class
// Count the number of spaces from the String
// Print String is small if number of spaces less than 5
// Print String is medium if number of spaces
//  greater than or equal to 5 and less than 10
// Print String is large if number of spaces greater than 10


import java.util.Scanner;

public class SizeOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter String");
        String str = sc.nextLine();

        int count =getNumberOfSpaces(str);
        if (count>=10){
            System.out.println("Large");
        } else if (count >=5) {
            System.out.println("Medium");
        }else {
            System.out.println("Small");
        }

    }
    static int getNumberOfSpaces(String str) {
        int count =0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i)==' '){
                count++;
            }

        }
        return count;

    }
}

/*
  Scanner scan = new Scanner(System.in);
        System.out.println("Enter your String :");
        String userString = scan.nextLine();

        System.out.println(sizeOfString(getNumberOfSpaces(userString)));

    }
    public static int getNumberOfSpaces (String str){

        int count = 0;
        for (int i = 0; i<str.length(); i++){
            if(str.charAt(i) == ' '){
                count++;
            }
        }
        return count;
    }
    public static String sizeOfString (int num){

        String size = "";
        if(num < 5){
            size = "Small";
        }else if(num >= 5 && num <= 10){
            size = "Medium";
        }else {
            size = "Large";
        }
        return size;
 */