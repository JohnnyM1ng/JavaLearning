package com.example.chapter5_generic_programming.ex_05_type_erasure;

import javax.management.ObjectName;

public abstract class A<T> {
    abstract T test(T t);
//    abstract Object test(Object t); // 编译后实际会变成这样
}
