package com.example.chapter3_object_oriented.ex_10_enum;


public class Person implements Study {
    protected String name;
    protected int age;

    @Override
    public void study1() {
        System.out.println("Im study1");
    }
    public void study2(){
        System.out.println("Im study2");
    }
}
