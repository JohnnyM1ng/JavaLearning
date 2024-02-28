package com.example.chapter4_object_oriented_high_level.ex_01_basic_wrapper_class;

public class Main {
    public static void main(String[] args) {
        // 如何以对象的形式使用基本数据类型
        Integer i = new Integer(10);
        Integer i1 = Integer.valueOf(11);
        System.out.println(i1);

        // 装箱/拆箱指基本包装类与其对应数据类型的相互转换
        int num = 10;
        Integer i2 = num; //自动装箱
        Integer i3 = 10;
        int num1 = i2; //自动拆箱

        Integer a = 10, b = 20;
        int c = a * b; //自动拆箱成基本类型参与计算
        System.out.println(c);

        Integer d = new Integer(10);
        Integer e = new Integer(10);
        System.out.println(d == e); //值相同但是是两个不同的对象

        Integer f = 10, g = 10;
        System.out.println(f == g); //-127-128的值已被提前存好，使用自动装箱会被认为是同一对象

        Integer j = 1000, k = 1000;
        System.out.println(j == k); //范围外就不是同一对象了

        Integer l = new Integer("666");
        System.out.println(l);
        System.out.println(Integer.toHexString(1563));
    }
}
