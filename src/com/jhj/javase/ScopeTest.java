package com.jhj.javase;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 2020/1/4.
 */
public class ScopeTest {
    public static void main(String[] args) {

    }

    /**
     * double的数据类型比int大
     * 所以在double转成int的时候需要强装
     * 在强转时由于int是整型，所以会四舍五入
     * 输出结果是1
     */
    public static void change(){
        double d = 1.20;
        int n =(int)d;
        System.out.println(n);
    }

    public static void yunsuang(){
        int a =1;
        System.out.println(++a);

        int b =1;
        System.out.println(b++);
    }

    public static void copyArry(){
        int[]a=new int[5];
        for (int i=0;i<5;i++){
            a[i] = new Random().nextInt(10);
        }
        int[] of = Arrays.copyOf(a, 10);
        System.out.println(Arrays.toString(of));
    }

     class Car{
        {
            System.out.println("构造代码块执行了");
        }

        public Car(){
            System.out.println("无参构造方法");
        }
    }
}
