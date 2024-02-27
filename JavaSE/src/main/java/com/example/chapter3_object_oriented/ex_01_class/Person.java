package com.example.chapter3_object_oriented.ex_01_class;

public class Person {
    public String name;
    public int age;
    public String sex;
    public static String info;

    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Person(){

    }
    public void hello(){
        System.out.println("hello!");
    }

    public void setName(String name){
        this.name = name;
    }
}
