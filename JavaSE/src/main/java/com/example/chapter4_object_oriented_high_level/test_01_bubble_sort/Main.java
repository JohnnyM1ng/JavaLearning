package com.example.chapter4_object_oriented_high_level.test_01_bubble_sort;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{32, 15, 27, 62, 99, 20, 86, 1, 8, 4};
        int[] sorted_arr = bubbleSort(arr);
        System.out.println(Arrays.toString(sorted_arr));;
    }
    public static int[] bubbleSort(int[] arr){
        int tmp;
        for (int i = 0; i< arr.length; i++){
            for (int j = 0; j < arr.length-i-1; j++){
                if (arr[j]>arr[j+1]){
                    tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        return arr;
    }
}
