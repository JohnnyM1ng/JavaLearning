package com.example.chapter4_object_oriented_high_level.ex_13_lambda_expression;

public class Main {
    public static void main(String[] args) {
        Study s1 = new Study() {
            @Override
            public void study() {
                System.out.println("我是匿名内部类版的接口实现");
            }
        };
        // lambda表达式就是匿名内部类的简写
//        标准格式为：([参数类型 参数名称,]...) ‐> { 代码语句，包括返回值 }
//        和匿名内部类不同，Lambda仅支持接口，不支持抽象类
//        接口内部必须有且仅有一个抽象方法（可以有多个方法，但是必须保证其他方法有默认实现，必须留一个抽象方法出来）
        Study s2 = () -> System.out.println("我是lambda版的接口实现");
        s1.study();
        s2.study();
        Work w1 = new Work() {
            @Override
            public int work(int a) {
                return a + 1;
            }
        };
        Work w2 = (int a) -> {
            System.out.println("我是学习方法");
            return a + 1;};
        w1.work(5);
        w2.work(10);
    }

}
