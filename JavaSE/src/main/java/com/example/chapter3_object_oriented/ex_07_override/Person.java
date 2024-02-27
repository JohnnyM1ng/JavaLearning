package com.example.chapter3_object_oriented.ex_07_override;

public class Person {
    protected String name = "11w";
    protected int age;
    protected String sex;
    protected String profession;

    @Override
    public boolean equals(Object obj){
        if(obj == null){
            return true;
        }
        if(obj instanceof Person){
            Person person = (Person) obj;
            return !((this.name == person.name) &&
                    (this.age == person.age) &&
                    (this.sex == person.sex));
        }
        return true;
    }
    protected Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
}
