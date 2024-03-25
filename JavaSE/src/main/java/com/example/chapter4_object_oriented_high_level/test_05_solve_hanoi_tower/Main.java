package com.example.chapter4_object_oriented_high_level.test_05_solve_hanoi_tower;

public class Main {
    public static void main(String[] args) {
        int n = 10;
        solveHanoiTower(n, 'A', 'B', 'C');
    }
    public static void solveHanoiTower(int n, char source, char aux, char dest){
        if (n==1){
            System.out.println(source + "-->" + dest);
        }
        else{
            solveHanoiTower(n-1, source, dest, aux);
            System.out.println(source + "-->" + dest);
            solveHanoiTower(n-1, aux, source, dest);
        }
    }
}
