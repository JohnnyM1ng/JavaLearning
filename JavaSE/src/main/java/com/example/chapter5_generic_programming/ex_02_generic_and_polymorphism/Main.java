package com.example.chapter5_generic_programming.ex_02_generic_and_polymorphism;

public class Main {
    public static void main(String[] args) {
        A s1 = new A();
        System.out.println(s1.test());
        B s2 = new B();
        System.out.println(s2.test());
        C s3 = new C();
        System.out.println(s3.test());
    }

    static class A implements Study<Integer>{
        @Override
        public Integer test(){
            return null;
        }
    }

    static class B implements Study<String>{
        @Override
        public String test(){
            return "hello";
        }
    }

    static class C<T> implements Study<T>{
        @Override
        public T test(){
            return null;
        }
    }
}
