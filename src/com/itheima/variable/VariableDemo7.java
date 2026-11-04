package com.itheima.variable;

import java.util.Scanner;

public class VariableDemo7 {
    public static void main(String[] args) {
        // BMI身体质量指数计算公式：BMI=体重÷身高²(体重单位：千克，身高单位：米)
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入体重（千克）：");
        double weight = sc.nextDouble();
        System.out.println("请输入身高（米）：");
        double height = sc.nextDouble();
        double bmi = weight / (height * height);
        System.out.println("BMI值为：" + bmi);  
        sc.close();
    }
}
