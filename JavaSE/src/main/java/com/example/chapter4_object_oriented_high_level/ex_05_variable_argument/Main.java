package com.example.chapter4_object_oriented_high_level.ex_05_variable_argument;

public class Main {
    public static void main(String[] args) {
        Person p1 = new Person();
        p1.test(7,"1!", "5!", "哥们在这跟你说唱");

        for(String arg : args){
            System.out.println(arg);
        }
    }
}
