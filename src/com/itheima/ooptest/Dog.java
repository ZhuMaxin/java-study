package com.itheima.ooptest;

public class Dog {
  // 小狗有属性：姓名、年龄。
  // 行为：吃骨头
  // 实现以下需求
  // 要求1：小狗的年龄：0~15岁
  // 要求2：打印小狗所有的信息：小白，2岁
  // 要求3：调用吃骨头的方法打印效果：2岁的小白，正在吃骨头

  // 定义属性
  private String name;
  private int age;

  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }

  // 要求1：小狗的年龄：0~15岁
  public void setAge(int age) {
    if (age >= 0 && age <= 15) {
      this.age = age;
    } else {
      System.out.println("年龄必须在0~15岁之间");
    }
  }
  public int getAge() {
    return age;
  }

  // 要求3：调用吃骨头的方法打印效果：2岁的小白，正在吃骨头
  void eat() {
    System.out.println(getName() + "，" + getAge() + "岁，正在吃骨头");
  }

  // 构造方法
  public Dog() {
    System.out.println("创建了一个小狗对象");
  }
  // 要求2：打印小狗所有的信息：小白，2岁
  public Dog(String name, int age) {
    this.name = name;
    setAge(age); // 调用setAge方法进行年龄验证
  }
}
