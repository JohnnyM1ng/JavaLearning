package com.example.chapter3_object_oriented.ex_05_inheritance;

public class Worker extends Person{
    private int work_age;
    public Worker(String name, int age, String sex, String profession, int work_age){
        super(name, age, sex, profession); //调用父类的构造方法
        this.work_age = work_age;
//        this.name = name;
//        this.age = age;
//        this.sex = sex;
//        this.profession = profession;
    }
    public void work(){
        System.out.println(this.name + " Im working for " + work_age + " years");
    }
}
