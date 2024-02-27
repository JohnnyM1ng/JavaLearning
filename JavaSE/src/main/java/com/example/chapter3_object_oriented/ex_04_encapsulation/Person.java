package com.example.chapter3_object_oriented.ex_04_encapsulation;

public class Person {
    private String name;
    private int age;
    private String sex;

    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Person(){}

    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getSex(){
        return this.sex;
    }
}
