package com.itheima.opptest2;

public class OppTeacher {
  public static void main(String[] args) {
    // 创建一个老师对象
    Teacher teacher = new Teacher();
    // 给老师对象赋值
    teacher.name = "张三";
    teacher.age = 30;
    // 打印老师对象的属性
    System.out.println("老师对象的属性为：" + teacher.name + "，" + teacher.age + "岁");
    // 调用老师对象的方法
    teacher.teach();
    teacher.eat();
    teacher.sleep();
  }
}
