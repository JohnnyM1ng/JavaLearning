package com.example.chapter3_object_oriented.ex_05_inheritance;

public class Person {
    protected String name = "11w";
    protected int age;
    protected String sex;
    protected String profession;

    protected Person(String name, int age, String sex, String profession){
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
    }
    public void hello(){
        System.out.println("我叫 " + this.name + " Im " + this.profession);
    }
}
