package com.example.chapter5_generic_programming.ex_09_stack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<String> s1 = new Stack<>();
        s1.push("1");
        s1.push("2");
        s1.push("3");
        System.out.println(s1);
        String s = s1.pop();
        System.out.println(s.getClass().getName());
    }
}
