package com.jhj.javase.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by Administrator on 2020/1/5.
 */
public class Test4 {
    public static void main(String[] args) throws Exception {
        A a = new A();
        Class<? extends A> c = a.getClass();
        Field f = c.getDeclaredField("i");//获取名称为i的属性
        System.out.println(f);
        f.setAccessible(true); //设置私有可访问

        f.set(a,6);
        System.out.println(a.getI());

        Method getI = c.getMethod("getI");
        Method setI = c.getMethod("setI", int.class);
        int invoke = (int) getI.invoke(a); //执行指定的方法
        System.out.println(invoke);
        setI.invoke(a, 1);
        System.out.println(a.getI());

    }
}
