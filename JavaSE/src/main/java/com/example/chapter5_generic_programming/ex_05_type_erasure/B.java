package com.example.chapter5_generic_programming.ex_05_type_erasure;

public abstract class B<T extends Number> {
    abstract T test(T t);
//    abstract Number test(Number t); // 编译成这个
}
