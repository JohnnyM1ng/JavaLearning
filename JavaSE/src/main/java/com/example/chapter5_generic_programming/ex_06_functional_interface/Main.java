package com.example.chapter5_generic_programming.ex_06_functional_interface;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static final Consumer<Student> STUDENT_CONSUMER = student -> System.out.println(student + "真好吃");
    public static void main(String[] args) {
//        Supplier<Student> studentSupplier = new Supplier<Student>() {
//            @Override
//            public Student get() {
//                return new Student();
//            }
//        };
        // 替换为lambda表达式
//        Supplier<Student> studentSupplier = () -> new Student();

        // 替换为方法引用
        Supplier<Student> studentSupplier = Student::new;
        studentSupplier.get().hello();
        Student s1 = new Student();
        STUDENT_CONSUMER.andThen(st -> System.out.println("对吧")).accept(s1);
//        Function

    }
}
