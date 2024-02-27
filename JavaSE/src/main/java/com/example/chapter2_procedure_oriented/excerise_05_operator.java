package com.example.chapter2_procedure_oriented;

public class excerise_05_operator {
    public static void main(String[] args) {
        int b;
        int a = b = 666;
        int e = 1, f = 2;
        System.out.println(a);
        System.out.println(b);
        int c = 1 + 1;
        System.out.println(c);
        String str = "伞兵一号" + "lbw";
        System.out.println(str);
        String str1 = "伞兵" + 2 + 1.5 + 'A';
        System.out.println(str1);

        int a1 = 8, b1 = 5;
        double c1 =  (double) a1 / b1;
        System.out.println(c1);
        int y = 10, z = 20;
        boolean x = y == z;
        System.out.println(x);

        int a2 = 12;
        char b2 = a2 > 10 ? 'A' : 'B';   //三元运算符需要三个内容，第一个是判断语句，第二个是满足判断语句的值，第三个是不满足判断语句的值
        System.out.println(b2);
    }
}
