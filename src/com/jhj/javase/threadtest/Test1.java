package com.jhj.javase.threadtest;

/**
 * Created by Administrator on 2020/1/5.
 */

/**
 * 实现线程的第一种继承thread类
 */
public class Test1 {
    public static void main(String[] args) {
        T1 t1 = new T1();
        T1 t2 = new T1();
        t1.start();
        t2.start();
        System.out.println("---------------");
    }
    static class T1 extends Thread{
        @Override
        public  void run() {
            String n =getName();//获取线程名
            for (int i=0;i<100;i++){
                System.out.println(n+"-"+i);
            }
        }
    }
}
