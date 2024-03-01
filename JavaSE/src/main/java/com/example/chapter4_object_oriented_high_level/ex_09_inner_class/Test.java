package com.example.chapter4_object_oriented_high_level.ex_09_inner_class;

public class Test {
    public class Inner{
        public void test(){
            System.out.println("Im inner class!");
        }
    }

    public static void main(String[] args) {
        Test test = new Test();
        Test.Inner inner = test.new Inner();
        inner.test();
    }
}
