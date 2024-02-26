package exercise_01_class;

import java.security.PublicKey;

public class Person {
    public String name;
    public int age;
    public String sex;

    public Person(String name, int age, String sex){
        this.name = name;
        this.age = age;
        this.sex = sex;
    }
    public Person(){

    }
    public void hello(){
        System.out.println("hello!");
    }

    public void setName(String name){
        this.name = name;
    }
}
