package com.example.chapter3_object_oriented.ex_08_abstract_class;

import java.lang.ref.SoftReference;

public abstract class Person {
    protected String name;
    protected int age;
    protected String sex;
    protected String profession;

    protected Person(String name, int age, String sex, String profession) {
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.profession = profession;
    }

    public abstract void exam();
}
