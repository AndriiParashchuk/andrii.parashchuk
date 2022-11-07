package com.java.class20;

public class FrequencyOfGivenCharacter {
    public static void main(String[] args) {
        String str = "Hello, How are you?";


        System.out.println(getCharOfGivenString(str));

    }

    static int getCharOfGivenString(String str) {
        int count = 0;
        char target = 'e';
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                count++;
            }
        }

        return count;



    }
}
