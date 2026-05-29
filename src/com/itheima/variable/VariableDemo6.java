package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /* System.out.println("请输入一个整数：");
        int a = sc.nextInt();
        System.out.println("您输入的整数为：" + a);
        System.out.println("请输入一个小数：");
        double b = sc.nextDouble·();
        System.out.println("您输入的小数为：" + b);
        System.out.println("两个数的和为：" + (a + b)); */
        System.out.println("请输入文本：");
        String str = sc.next();
        System.out.println("您输入的文本为：" + str);   
        System.out.println(str);   
        sc.close();
    }
}
