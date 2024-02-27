package com.example.chapter2_procedure_oriented;

public class exercise_02_variable_and_const_value {
    public static void main(String[] args) {
        int a;
        a = 10;
        int a1 = 10;
        int b;
        int c, d;
        int f = a;
        System.out.println(f);

        final float PI = 3.14f; //常量定义

        short x = 10;
        int y = x;

        byte qq = 12;
        System.out.println(qq);

        int s = 2147483647;   //int最大值
        s = s + 1;   //继续加
        System.out.println(s);
    }
}
