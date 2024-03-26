package com.example.chapter5_generic_programming.ex_01_generic_class;

public class Score<U, T> {
    String name;
    U id;
    T score;

    public Score(String name, U id, T score){
        this.name = name;
        this.id = id;
        this.score = score;
    }

    public T getScore(){
        return score;
    }
}
