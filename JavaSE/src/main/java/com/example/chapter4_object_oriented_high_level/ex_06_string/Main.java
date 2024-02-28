package com.example.chapter4_object_oriented_high_level.ex_06_string;

public class Main {
    public static void main(String[] args) {
        String str = "Hello Java !!";
        String str1 = new String("Hello Java");
        String str2 = new String("Hello java");
        System.out.println(str.equals(str1));
        System.out.println(str2.equals(str1));

        System.out.println(str1.length());
        System.out.println("aaaeee".length());

        String sub = str.substring(0, 3); //裁剪方法
        System.out.println(sub);

        String[] strs = str.split(" "); //分割方法
        for(String s : strs){
            System.out.println(s);
        }

        char[] chars = str.toCharArray(); //字符串->字符数组
        System.out.println(chars);

        String str3 = new String(chars); // 字符数组->字符串
        System.out.println(str3);
    }
}
