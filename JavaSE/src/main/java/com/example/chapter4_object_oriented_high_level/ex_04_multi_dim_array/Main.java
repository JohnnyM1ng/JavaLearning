package com.example.chapter4_object_oriented_high_level.ex_04_multi_dim_array;

public class Main {
    public static void main(String[] args) {
        int[][] array1 = new int[2][5];
        System.out.println(array1.length);
        System.out.println(array1[1].length);

        int[][] array2 = {{1, 3}, {2, 5}, {3, 6}};
        System.out.println(array2[2][1]);

        for(int i = 0; i < 3; i++){
            for(int j =0; j < 2; j++){
                System.out.println(array2[i][j]);
            }
        }
        System.out.println(array1[0]);
    }
}
