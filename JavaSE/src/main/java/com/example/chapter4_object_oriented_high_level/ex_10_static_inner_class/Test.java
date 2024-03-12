package com.example.chapter4_object_oriented_high_level.ex_10_static_inner_class;

public class Test {
    private String name;
    public Test(String name){
        this.name = name;
        System.out.println(Inner.test); // 外部可以访问内部类的静态变量
//        System.out.println(Inner.test1); // 但不可访问非静态变量
    }


    public static class Inner{

        static String test;
        String test1;
        public void test(){
            System.out.println("Im static inner class ");
//            System.out.println(name);// 无法访问外部字段，因为静态类不依附于外部类（不需创建外部类实例）

        }
    }

}
