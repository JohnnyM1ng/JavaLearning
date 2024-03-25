package com.example.chapter4_object_oriented_high_level.ex_12_anonymous_inner_class;

public class Main {
    public static void main(String[] args) {
        // 正常情况下，要创建一个抽象类的实例对象，只能对其进行继承，先实现未实现的方法，然后创建子类对象。
        // 而我们可以在方法中使用匿名内部类，将其中的抽象方法实现，并直接创建实例对象
        Student s1 = new Student() {
            @Override
            public void test() {
                System.out.println("我是匿名内部类的实现");
            }
        };// 这里抽象类就定义好了，没有类名（匿名）
        // 好处在于创建一个先前不存在的类的对象，用完就销毁这个类，不需要手动去定义一个类继承抽象类
        s1.test();
        Test.Inner.test();
//        只用到了内部类，不会初始化外部类
//        内部类初始化
//        我是静态内部类!
    }
}
