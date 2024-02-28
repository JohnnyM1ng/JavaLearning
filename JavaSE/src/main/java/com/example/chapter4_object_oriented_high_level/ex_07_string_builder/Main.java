package com.example.chapter4_object_oriented_high_level.ex_07_string_builder;

public class Main {
    public static void main(String[] args) {
        // 字符串支持用 +、+=进行拼接操作
        String str1 = "你干嘛" + "哎哟"; //编译时直接拼接
        System.out.println(str1);

        String s1 = "你看";
        String s2 = "这汉堡";
        String s3 = "做滴行不行！";
        StringBuilder sBuilder = new StringBuilder(); //用于构造字符串的类
        sBuilder.append(s1).append(s2).append(s3);
        System.out.println(sBuilder.toString());

        StringBuilder sBuilder1 = new StringBuilder();
        sBuilder1.append("AAA");
        sBuilder1.append("BBB");
        System.out.println(sBuilder1);
    }
}
