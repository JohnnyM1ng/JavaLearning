package com.example.chapter3_object_oriented.ex_08_abstract_class;

public class Worker extends Person{
    public Worker(String name, int age, String sex, String profession) {
        super(name, age, sex, profession);
    }

    public void exam(){
        System.out.println("Im " + this.profession + "\n" +
                 "Im not good at exam");
    }
}
