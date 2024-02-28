package com.example.chapter4_object_oriented_high_level.ex_05_variable_argument;

public class Person {
    String name;
    int age;

    public void test(int num, String ... strings){ //可变长参数只能作为最后一个参数
        System.out.println(num);
        for(String string : strings){
            System.out.println(string);
        }
    }
}
