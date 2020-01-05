package com.jhj.javase.threadtest;

/**
 * Created by Administrator on 2020/1/5.
 */

/**
 * 实现runable接口
 */
public class Test2 {
    public static void main(String[] args) {
        T2 t1 = new T2();
        Thread t = new Thread(t1);
        Thread t2 = new Thread(t1);
        t.start();
        t2.start();
        System.out.println("---------------");
    }
    static class T2 implements Runnable{

        @Override
        public void run() {
            Thread thread = Thread.currentThread();
            String n =thread.getName();
            for (int i=0;i<100;i++){
                System.out.println(n+"-"+i);
            }
        }
    }
}
