package com.java.practice.collections;

//Find duplicate words from the given statement

import java.util.HashSet;
import java.util.Set;

public class SetAssignment {
    public static void main(String[] args) {

        String str = "the compulsory contribution to state revenue, levied by the " +
                "government on workers income and business profits or added " +
                "to the cost of some goods services and transactions";

        String[] words = str.split(" ");

        Set<String> setOfWords = new HashSet<>();
        Set<String> duplicateWords = new HashSet<>();

        for (String word : words){
            if (!setOfWords.add(word)){
                duplicateWords.add(word);
            }
        }
        System.out.println("Duplicate words: "+ duplicateWords);
    }
}
