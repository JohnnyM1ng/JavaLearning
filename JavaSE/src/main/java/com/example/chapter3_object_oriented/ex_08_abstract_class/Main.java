package com.example.chapter3_object_oriented.ex_08_abstract_class;

public class Main {
    public static void main(String[] args) {
        Worker w1 = new Worker("Alice", 25, "female", "worker");
        w1.exam();
//        Person p1 = new Person(); //抽象类无法实例化
    }
}

