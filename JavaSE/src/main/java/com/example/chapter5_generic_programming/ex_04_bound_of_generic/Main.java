package com.example.chapter5_generic_programming.ex_04_bound_of_generic;

public class Main {
    public static void main(String[] args) {
        Score<Integer> s1 = new Score<>("math", "12", 34);
//        Score<String> s2 = new Score<String>("english", "13", "1566");
        Score<? extends Integer> s3;
        Score<?> s4 = new Score<>("", "", 14); // 会被类型转换为Number

        System.out.println(s4.value.getClass().getName());
//        s3 = new Score<>("pe", "16", 45.6);
    }
}
