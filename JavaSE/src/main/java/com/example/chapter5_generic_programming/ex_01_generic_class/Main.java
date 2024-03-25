package com.example.chapter5_generic_programming.ex_01_generic_class;

public class Main {
    public static void main(String[] args) {
        Score<Integer> s1 = new Score<>("Jack", 15, 79);
        Score<String> s2 = new Score<>("Alice", 15, "优秀");
//        Score<Integer> s3 = new Score<>("Alice", 15, "优秀");
        System.out.println(s1.score);
        System.out.println(s2.score);
    }
}
