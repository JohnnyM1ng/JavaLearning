package com.example.chapter5_generic_programming.ex_04_bound_of_generic;

public class Score<T extends Number> {
    String name;
    String id;
    T value;

    public Score(String name, String id, T value){
        this.name = name;
        this.id = id;
        this.value = value;
    }
}
