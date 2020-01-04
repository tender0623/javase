package com.jhj.javase.extentTest;

/**
 * Created by Administrator on 2020/1/4.
 */
public class ErZi extends BaBa {

    public ErZi(){
        System.out.println("我是儿子的无参构造方法");
    }
    @Override
    public void eat() {
        System.out.println("我是儿子执行了eat方法");
    }
}
