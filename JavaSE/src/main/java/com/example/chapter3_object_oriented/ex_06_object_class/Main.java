package com.example.chapter3_object_oriented.ex_06_object_class;

public class Main {
    public static void main(String[] args) {
//        Person person = new Person();
//        person.getClass();
//        System.out.println(person.getClass());
        Person p1 = new Person("Jay", 25, "male");
        Person p2 = new Person("Mike", 14, "male");
        System.out.println(p1.equals(p2));
    }
}
