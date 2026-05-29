package com.itheima.variable;

public class VariableDemo5 {
    public static void main(String[] args) {
        // BMI身体质量指数计算公式：BMI=体重÷身高²(体重单位：千克，身高单位：米)
        double weight = 58;
        double height = 1.68;
        double bmi = weight / (height * height);
        System.out.println("BMI值为：" + bmi);
    }
}
