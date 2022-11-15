package com.java.class25;

public class InClassAssignmentArray {
    public static void main(String[] args) {

        String str = "Today is Monday, it started well";
        String[] words = str.split(" ");  // .split()

        for (String word : words){
            System.out.println(word +" - " + word.length());  //.length()
        }
    }
}
