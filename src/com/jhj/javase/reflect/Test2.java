package com.jhj.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/1/5.
 */
public class Test2 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("输入类名:");
        String s = new Scanner(System.in).nextLine();
        Class<?> c = Class.forName(s);
        //拿到包名
        System.out.println(c.getPackage().getName());
        //拿到完整类名
        System.out.println(c.getName());
        //类名,不包括包名
        System.out.println(c.getSimpleName());

        System.out.println("-------成员变量------");
        f1(c);
        System.out.println("-------构造方法------");
        f2(c);
        System.out.println("----------方法-----------");
        f3(c);
    }

    private static void f3(Class<?> c) {
        Method[] methods = c.getDeclaredMethods();//获取本类定义的方法,包括私有,不包括继承的方法
        for (Method method : methods) {
            String name = method.getName();//获取方法名
            Class<?>[] p = method.getParameterTypes();
            System.out.println(name+"("+ Arrays.toString(p)+")");
        }

    }

    private static void f2(Class<?> c) {
        Constructor<?>[] constructors = c.getDeclaredConstructors();//获取所有的构造方法包括私有
        for (Constructor<?> constructor : constructors) {
            String n = c.getSimpleName();
            Class<?>[] p = constructor.getParameterTypes();//获取构造方法里面的参数类型
            System.out.println(n+"("+ Arrays.toString(p)+")");
        }

    }

    private static void f1(Class<?> c) {
        Field[] a = c.getDeclaredFields(); //获取成员变量,包括私有,但是不包括继承的变量
        for (Field field : a) {
            String t = field.getType().getSimpleName(); //拿到变量的类型,比如int long等
            String n = field.getName(); //获取变量的名字
            System.out.println(t+" "+n);
        }

    }
}
