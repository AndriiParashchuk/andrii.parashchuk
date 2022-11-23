package com.java.class28;

public class Person {

    String name = "Nazik";
    double height;
    int age;
    char gender;

    public Person(){
        name = "Matei";
        height = 3.5;
        age = 3;
        gender ='M';
    }

    void eat() {
        System.out.println(name + " is eating");
    }

    void sleep() {
        System.out.println(name + " is sleeping");
    }

    void displayPersonInfo() {
        System.out.println(name);
        System.out.println(height);
        System.out.println(age);
        System.out.println(gender);
    }
}
