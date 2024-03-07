package com.example.chapter4_object_oriented_high_level.ex_09_member_inner_class;

public class Main {
    public static void main(String[] args) {
        Test test1 = new Test("Mike"); // 先创建外部类对象
        Test.Inner inner1 = test1.new Inner();// 再通过对象去访问内部类
        inner1.test();

        Test test2 = new Test("John"); // 先创建外部类对象
        Test.Inner inner2 = test2.new Inner();// 再通过对象去访问内部类
        inner2.test();

        test1.getInnerFiled();
    }
}
