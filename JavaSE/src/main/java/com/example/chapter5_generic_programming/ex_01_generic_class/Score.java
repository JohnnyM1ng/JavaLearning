package com.example.chapter5_generic_programming.ex_01_generic_class;

public class Score<T> {
    String name;
    int age;
    T score;

    public Score(String name, int age, T score){
        this.name = name;
        this.age = age;
        this.score = score;
    }
}
