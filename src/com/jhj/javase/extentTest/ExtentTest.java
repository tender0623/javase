package com.jhj.javase.extentTest;

/**
 * Created by Administrator on 2020/1/4.
 */

/**
 * 构造方法使用：
 *  子类创建对象的时候，默认会去访问父类的无参构造方法。在去执行自己的无参构造方法
 *  原因是子类的构造方法第一行，都默认有一句语句：super();this();
 *  父类没有无参构造时，可以用super调用父类的其他构造
 */
public class ExtentTest {
    public static void main(String[] args) {
        ErZi erZi = new ErZi();
        erZi.eat();//可以调用父类的方法

        System.out.println(erZi.country);
        System.out.println(erZi.money);

    }

    /**
     * 总结:
     *  1. this和super的区别
     *      1.this代表本类对象的引用，supre代表父类对象的引用
     *      2.this用于区分局部变量和成员变量
     *      3.super用于区分本类变量和父类变量
     *      4.this.成员变量 this.成员方法（） this([参数])代表调用本类构造方法
     *      5.super.成员变量 super.成员方法（） super([参数])代表调用父类构造方法
     *      6. this和super不可以同时出现在同一个构造方法里，因为他们两个只要出现都得放在第一条语句。
     *
     *  2.创建对象的流程
     *  Person p =new Person();
     *  1.把Person.class文件加载进内存；
     *  2.在栈内存中，开辟空间，存放变量p；
     *  3.在堆内存中，开辟空间，存放Person对象
     *  4.对成员变量进行默认的初始化
     *  5.对成员变量进行显示初始化
     *  6.执行构造方法（如果有构造代码块，就先执行构造代码块）
     *  7.堆内存完成
     *  8.把堆内存的地址值赋值给变量P，P就是一个应用变量，应用了Person对象的地址值；
     */
}
