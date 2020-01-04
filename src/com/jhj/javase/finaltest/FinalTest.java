package com.jhj.javase.finaltest;

/**
 * Created by Administrator on 2020/1/5.
 */

/**
 * final可以修饰类，方法，成员变量
 * 特点
 *  1.被final修饰的类，不能被继承
 *  2.被final修饰的的方法，不能被重写
 *  3.被final修饰的变量是个常量，不能被改变
 *  4.常量的定义形式：final 数据类型 常量名 = 值
 */
public class FinalTest {
    public static void main(String[] args) {
        Son son = new Son();
        System.out.println(son.age);
    }
}
