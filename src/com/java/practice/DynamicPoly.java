package com.java.practice;

class Parent{
    public void doAction(){
        System.out.println("Action from Parent");
    }
}

class Child extends Parent{
    public void doAction(){
        System.out.println("Action from Child");
    }
}

public class DynamicPoly {
    public static void main(String[] args) {
        Parent pp = new Parent();
        pp.doAction();

        Child cc = new Child();
        cc.doAction();

        Parent pc = new Child();
        pc.doAction();

        //Child cp = new Parent();
        //cp.doAction();
    }
}
