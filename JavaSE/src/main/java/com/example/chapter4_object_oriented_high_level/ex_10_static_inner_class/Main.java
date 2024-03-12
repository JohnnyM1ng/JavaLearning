package com.example.chapter4_object_oriented_high_level.ex_10_static_inner_class;

public class Main {
    public static void main(String[] args) {Test test1 = new Test("mike");
        Test.Inner inner1 = new Test.Inner();
        inner1.test();
    }
}
