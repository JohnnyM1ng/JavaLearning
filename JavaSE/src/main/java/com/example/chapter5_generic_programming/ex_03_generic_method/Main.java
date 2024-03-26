package com.example.chapter5_generic_programming.ex_03_generic_method;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        test(3);
        String t1 = test("11");
        Integer t2 = test(2);
        int t3 = test(3);

        Integer[] arr = {3321, 2, 13, 42, 35, 26, 47, 98, 9};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr, (o1, o2) -> o2 - o1);
        System.out.println(Arrays.toString(arr));

        Integer[] newArray = Arrays.copyOf(arr, 5);
        System.out.println(Arrays.toString(newArray));
    }

    private  static <T> T test(T t){
        System.out.println(t);
        return t;

    }
}
