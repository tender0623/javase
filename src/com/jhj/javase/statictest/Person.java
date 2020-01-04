package com.jhj.javase.statictest;

/**
 * Created by Administrator on 2020/1/4.
 */
public class Person {

    /**
     * 执行顺序，静态代码块》构造代码块》局部代码块
     */
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("执行了构造代码块");
    }
    static String name="Lucy";

    public void eat(){
        System.out.println("Lucy在吃东西");
    }

    public Person(){
        System.out.println("我是构造方法，我执行了");
    }
}
