package com.jhj.javase.reflect;

/**
 * Created by Administrator on 2020/1/5.
 */
public class Test1 {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException {
        //获取类对象
        Class<A> c1 = A.class;
        //实例化对象
        A a = c1.newInstance();

        C c = new C();
        Class<C> c3 = (Class<C>) c.getClass();

    }
}
