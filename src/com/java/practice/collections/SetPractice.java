package com.java.practice.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetPractice {
    public static void main(String[] args) {

        Set<String> setOfItems = new HashSet<String>();

        setOfItems.add("Tomato");
        setOfItems.add("Apple");
        setOfItems.add("Orange");
        setOfItems.add("Mango");
        setOfItems.add("Pineapple");

//
//        System.out.println(setOfItems.add("Tomato"));
//        System.out.println(setOfItems.add("Apple"));
//        System.out.println(setOfItems.add("Orange"));
//        System.out.println(setOfItems.add("Tomato"));

        System.out.println(setOfItems.size());

        for (String item : setOfItems){
            System.out.println(item);
        }

        Iterator<String> itr = setOfItems.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }

    }
}
