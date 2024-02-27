package com.example.chapter3_object_oriented.ex_03_static_method;

import com.example.chapter3_object_oriented.ex_01_class.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        Person p2 = new Person();
//        System.out.println(p2.info);
//        p1.info = "哎哟你干嘛";
//        System.out.println(p2.info);

        System.out.println(Person.info);
        Person.info = "及你太美";
        System.out.println(Person.info);
    }
}
