package com.example.chapter3_object_oriented.ex_06_object_class;

public class Person {
    protected String name = "11w";
    protected int age;
    protected String sex;
    protected String profession;

    protected Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
