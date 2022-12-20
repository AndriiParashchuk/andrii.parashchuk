package com.java.practice.collections;

//List is an ordered collection of elements
//It allows duplicate values
//Each element will get stored at a specific index
//We have ArrayList and LinkedList classes in Java which implements Lost interface

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ListPractice {
    public static void main(String[] args) {

        //Create Object of List
        List<String> listOfItems = new ArrayList<String>();

        listOfItems.add("Tomato");
        listOfItems.add("Apple");
        listOfItems.add("Orange");
        listOfItems.add("Mango");
        listOfItems.add("Pineapple");

//        System.out.println(listOfItems.size());
//        System.out.println(listOfItems.get(0));

        for (int i = 0; i < listOfItems.size(); i++) {
            System.out.println(listOfItems.get(i));
        }
        for (String item : listOfItems){
            System.out.println(item);
        }
        Iterator<String>itr = listOfItems.iterator();
        while (itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
