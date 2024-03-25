package com.example.chapter4_object_oriented_high_level.ex_12_anonymous_inner_class;

public class Test {
    static {
        System.out.println("外部类初始化");
    }

    public static class Inner{
        static {
            System.out.println("内部类初始化");
        }

        public static void test(){
            System.out.println("我是静态内部类!");
        }
    }
}
