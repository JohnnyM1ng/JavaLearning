package com.example.chapter4_object_oriented_high_level.ex_11_local_inner_class;

public class Main {
    // 局部内部类就像局部变量一样，可以在方法中定义
    public static void main(String[] args) {

    }

    public void test(){
        // 作用范围只能在方法中
        class Local{

        }

        Local l = new Local();
    }
}
