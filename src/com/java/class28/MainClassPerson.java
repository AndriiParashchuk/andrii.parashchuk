package com.java.class28;

public class MainClassPerson {
    public static void main(String[] args) {
        Person Andrii = new Person();
        Andrii.age = 33;
        Andrii.name = "Andrew";
        Andrii.gender = 'M';
        Andrii.height = 6.7;

        Andrii.sleep();
        Andrii.eat();
        Andrii.displayPersonInfo();

        Person Matei = new Person();
        Matei.displayPersonInfo();
        Person Nataliya = new Person();
        Nataliya.displayPersonInfo();


    }
}
