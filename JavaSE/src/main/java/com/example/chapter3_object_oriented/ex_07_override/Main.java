package com.example.chapter3_object_oriented.ex_07_override;

import com.example.chapter3_object_oriented.ex_07_override.Person;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("Jay", 25, "male");
        Person p2 = new Person("Mike", 14, "male");
        System.out.println(p1.equals(p2));
    }
}
