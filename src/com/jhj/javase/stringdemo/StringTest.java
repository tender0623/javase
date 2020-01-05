package com.jhj.javase.stringdemo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.SimpleFormatter;

/**
 * Created by Administrator on 2020/1/5.
 */
public class StringTest {

    public static void main(String[] args) {
        method();
    }

    /**
     * StringBuffer和StringBuilder的区别
     * 1.线程安全上 StringBuffer是线程安全的（@ since JDK1.0)
     *              StringBuilder是线程不安全的（@ since JDK1.5)
     * 2. 在执行效率上 StringBuilder>StringBuffer>String
     *    以下例子输出结果    20s          25s
     *  3.源码体现：本质上都是在调用父类抽象类AbstractBuilder干活，只不过buffer加了synchronized关键字
     *
     */
    public static void method(){
        String source ="abcdefghijklmnopqrstuvwxyz";
        StringBuffer stringBuffer = new StringBuffer();
        StringBuilder builder = new StringBuilder();
        long start = System.currentTimeMillis();
        for (int i=0;i<100000;i++){
//            stringBuffer.append(source);
            builder.append(source);
        }
        long end = System.currentTimeMillis();
        System.out.println(end-start);
    }
}
