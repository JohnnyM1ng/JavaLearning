package com.example.chapter3_object_oriented.ex_10_enum;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setStatus(Status.running);
        System.out.println(s1.getStatus());
    }
}
