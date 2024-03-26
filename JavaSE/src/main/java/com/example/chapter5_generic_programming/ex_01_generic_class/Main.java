package com.example.chapter5_generic_programming.ex_01_generic_class;

public class Main {
    public static void main(String[] args) {
        // 使用时才明确具体类型
        Score<String, Double> s1 = new Score<>("Jack", "axxx", 79.1);
        Score<Integer, Character> s2 = new Score<>("Alice", 15, 's');
//        Score<Integer, Character> s3 = s1;
        Score<Integer, Character> s3 = s2;
        Score<int[], Character> s4 = new Score<>("Bob", new int[10], 'w'); // int是基本类型，但int数组是引用类型
        System.out.println(s1.score);
        System.out.println(s2.getScore());
    }
}
