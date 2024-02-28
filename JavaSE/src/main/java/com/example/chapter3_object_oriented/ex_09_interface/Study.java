package com.example.chapter3_object_oriented.ex_09_interface;

// 定义好接口后在类中做实现，接口不依赖于类
public interface Study {
    void study1();
    void study2();

    default void test(){
    };

    // 接口中不允许存在成员变量与成员方法，但是可以有静态变量静态方法
    public static int a = 10;
    public static void testA(){
        System.out.println("Im static method in interface");
    }
}
