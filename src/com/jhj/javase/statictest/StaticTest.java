package com.jhj.javase.statictest;

/**
 * Created by Administrator on 2020/1/4.
 */
public class StaticTest {
    public static void main(String[] args) {
        System.out.println(Person.name);
        Person person = new Person();
        person.name="rose";
        System.out.println(person.name);
        Person p=new Person();
        System.out.println(p.name);
        /**
         * 以下是输出结果
         * Lucy
         我是构造方法，我执行了
         rose
         我是构造方法，我执行了
         rose
         * 因为静态变量就加载一次，在new了一个person对象后改变了他的name值
         * 后面再new对象，由于就加载一次，所以name的属性已经被改过来了
         */
    }
}
