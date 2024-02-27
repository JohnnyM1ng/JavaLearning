package com.example.chapter2_procedure_oriented;

public class exercise_06_loop {
    public static void main(String[] args) {
        int i = 0;   //在外面创建变量i，这样全部范围内都可以使用了
        for (; i < 3; i++) {   //for循环的三个表达式并不一定需要编写
            System.out.println("伞兵一号卢本伟准备就绪！");
            System.out.println("当前i的值为："+i);
        }
        System.out.println("当前i的值为："+i);
        for (int i1 = 0; i1 < 3; i1++)    //外层循环执行3次
            for (int j = 0; j < 3; j++)    //内层循环也执行3次
                System.out.println("1！5！");
    }
}
