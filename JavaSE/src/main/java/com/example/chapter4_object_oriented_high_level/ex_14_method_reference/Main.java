package com.example.chapter4_object_oriented_high_level.ex_14_method_reference;

public class Main {
    public static void main(String[] args) {
//        Study study = (a, b) -> Interger.sum(a, b);  lambda写法
//        Study study = Integer::sum; //方法引用写法
        Main main = new Main();
        Study study1 = main::lbwnb;
        System.out.println(study1.sum(10, 20));
    }


    public int  lbwnb(int a, int b){
        return a + b;
    }
}
