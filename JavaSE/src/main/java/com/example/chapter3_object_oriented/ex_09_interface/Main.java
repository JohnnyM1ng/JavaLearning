package com.example.chapter3_object_oriented.ex_09_interface;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.study1();
        p1.study2();

        System.out.println(Study.a + " " ); //调用接口内的静态内容用接口.的方式访问
        Study.testA();
    }
}
