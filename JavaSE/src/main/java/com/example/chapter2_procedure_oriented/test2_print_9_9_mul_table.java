package com.example.chapter2_procedure_oriented;

public class test2_print_9_9_mul_table {
    public static void main(String[] args) {
        for(int i = 1; i < 10; i++){
            for(int j = 1; j <= i; j++){
                System.out.printf(i + "*" + j + "=" + i*j + "\t");
            }
            System.out.printf("\n");
        }
    }
}
