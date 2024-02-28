package com.example.chapter4_object_oriented_high_level.ex_03_array;

public class Main {
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(array[1]); //基本类型的array 默认值是0
        char[] arrayc = new char[10];
        System.out.println(arrayc[1]);
        String[] arrays = new String[10];
        System.out.println(arrays[1]); //引用类型的array 默认值是null

        int[] array1 = new int[]{1, 2, 3}; //数组本身以对象类型存在，不是基本数据类型
        int[] array2 = {4, 5, 6};
        System.out.println(array1[1]);
        array1[1] = 777;
        System.out.println(array1[1]);

        System.out.println(array.length); //数组的length不允许修改

        System.out.println(array1.toString());

        for(int i : array1){
            System.out.println(i + "\t");
        }

        int[] arr = new int[10];
        Object obj = arr;

        String[] arrs = new String[10];
        Object objs = arrs;

        System.out.println(array2);
    }
}
