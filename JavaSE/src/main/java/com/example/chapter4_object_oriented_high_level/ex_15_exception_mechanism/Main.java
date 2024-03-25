package com.example.chapter4_object_oriented_high_level.ex_15_exception_mechanism;

public class Main {
    public static void main(String[] args) {
        test(1, 0); // 运行时异常

    }
    private static int test (int a, int b){
        return a/b;
    }
}
