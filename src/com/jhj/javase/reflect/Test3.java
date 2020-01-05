package com.jhj.javase.reflect;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Scanner;

/**
 * Created by Administrator on 2020/1/5.
 */
public class Test3 {
    public static void main(String[] args) throws ClassNotFoundException {
        System.out.println("输入类名:");
        String s = new Scanner(System.in).nextLine();
        Class<?> c = Class.forName(s);
        Object o1 = null;
        Object o2 =null;
        System.out.println("----执行无参构造----");
        try {
            o1=c.newInstance();
            System.out.println(o1);
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        System.out.println("-------执行有参构造-------");
        try {
            Constructor<?> constructor = c.getConstructor(int.class); //获取构造方法
            try {

                o2=constructor.newInstance(6);//新建实例,并执行构造方法
                System.out.println(o2);
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            } catch (InvocationTargetException e) {
                e.printStackTrace();
            }
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        }

    }
}
