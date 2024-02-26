package exercise_02_create_and_use_method;

import exercise_01_class.Person;

public class ConstructionMethod {
    public static void main(String[] args) {
        Person p = new Person("Mike", 32, "male");
        System.out.println(p.name + p.age + p.sex);
    }
}
