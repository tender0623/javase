package com.jhj.javase.reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * Created by Administrator on 2020/1/5.
 */
public class Demo {
    public static void main(String[] args) throws Exception {
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        Method add = list.getClass().getMethod("add", Object.class);
        add.invoke(list,111);
        System.out.println(list);
    }
}
