package com.example.chapter5_generic_programming.ex_07_arraylist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> l1 = new ArrayList();
        for(int i = 0; i < 20; i++){
            l1.add(i, i);
        }
        System.out.println(l1.toString());
        l1.remove(0);
        System.out.println(l1.toString());

    }
}
