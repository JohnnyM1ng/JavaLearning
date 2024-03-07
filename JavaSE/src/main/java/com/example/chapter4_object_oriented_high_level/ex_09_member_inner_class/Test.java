package com.example.chapter4_object_oriented_high_level.ex_09_member_inner_class;

public class Test {
    private String name;
    public Test(String name){
        this.name = name;
    }

    public void getInnerFiled(){
        System.out.println(Inner.name);
    }
    public class Inner{

        public static String name = "aaa";
        public void test(){
            System.out.println("内部类的name1 " + name);
            System.out.println("内部类的name2 " + this.name);
            System.out.println("外部类的name " + Test.this.name); //就近，不加外部类名就是内部类
        }
    }

}
