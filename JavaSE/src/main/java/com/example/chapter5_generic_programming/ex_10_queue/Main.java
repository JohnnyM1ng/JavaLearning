package com.example.chapter5_generic_programming.ex_10_queue;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Integer> q1 = new LinkedList<>();
        q1.offer(1);
        q1.offer(2);
        q1.offer(3);
        q1.poll();
        System.out.println(q1);
    }
}
