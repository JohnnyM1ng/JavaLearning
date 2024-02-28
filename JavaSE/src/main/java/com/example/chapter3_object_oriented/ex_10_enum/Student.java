package com.example.chapter3_object_oriented.ex_10_enum;



public class Student extends Person implements Study {
    private Status status;
    public Status getStatus(){
        return status;
    }
    public void setStatus(Status status){
        this.status = status;
    }

    public void study1() {
        System.out.println("Im study1");
    }
    public void study2(){
        System.out.println("Im study2");
    }
}

