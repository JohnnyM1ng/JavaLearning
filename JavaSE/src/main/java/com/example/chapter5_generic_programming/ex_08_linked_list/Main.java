package com.example.chapter5_generic_programming.ex_08_linked_list;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> l1 = new LinkedList<>();
        l1.add(0, 1);
        System.out.println(l1);
        l1.add(1, 2);
        System.out.println(l1);
        System.out.println(l1.get(1));
    }
}
