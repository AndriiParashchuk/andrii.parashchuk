package com.java.practice.collections;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FindFrequencyOfWord {
    public static void main(String[] args) {

        String str = "Programming is the process of creating a set of instructions " +
                "that tell a computer how to perform a specific task";

        String[] words = str.split(" ");
        Map<String,Integer> frequency = new HashMap<>();

        for (String word : words){
            if (!frequency.containsKey(word)){
                frequency.put(word,1);
            }else {
                int prevFreq = frequency.get(word);
                frequency.put(word,prevFreq+1);
            }
        }
        Set<Map.Entry<String, Integer>> pairs = frequency.entrySet();
        for (Map.Entry<String,Integer> pair : pairs){
            System.out.println(pair.getKey()+" = "+pair.getValue());
        }
    }
}
