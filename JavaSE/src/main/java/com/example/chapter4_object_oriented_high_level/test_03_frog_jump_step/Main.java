package com.example.chapter4_object_oriented_high_level.test_03_frog_jump_step;

public class Main {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(frogJumpStep(n));
    }
    public static int frogJumpStep(int n){
        // n阶的走法，即为n阶往前推一步的两种情况之和，即n-1阶和n-2阶走法之和
        if(n==1){
            return 1;
        }
        else if(n==2){
            return 2;
        }
        return frogJumpStep(n-2) + frogJumpStep(n-1);
    }
}
