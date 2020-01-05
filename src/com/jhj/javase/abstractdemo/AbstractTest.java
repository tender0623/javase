package com.jhj.javase.abstractdemo;

/**
 * Created by Administrator on 2020/1/5.
 */
public class AbstractTest {
    public static void main(String[] args) {
        //Animal animal = new Animal(); 抽象类不能够被实例化
        Animal an= new Dog();

        String name="abc";
        String n = new String("abc");
        System.out.println(name==n);

    }
    /**
     * 抽象类和接口的区别
     *  1.抽象类和接口都不能直接实例化，如果要实例化，抽象类变量必须指向实现所有抽象方法的子类对象，接口变量必须指向实现所有接口方法子类对象
     *  2.抽象类是继承（extend），接口是要被实现implement
     *  3.接口只能做方法声明，抽象类中可以做方法申明，也可以做方法实现
     *  4、接口里定义的变量只能是公共的静态的常量，抽象类中的变量是普通变量。
     *  5、抽象类里的抽象方法必须全部被子类所实现，如果子类不能全部实现父类抽象方法，那么该子类只能是抽象类。同样，一个实现接口的时候，如不能全部实现接口方法，那么该类也只能为抽象类。
     *  6、抽象方法只能申明，不能实现，接口是设计的结果 ，抽象类是重构的结果
     *  7、抽象类里可以没有抽象方法
     *  8、如果一个类里有抽象方法，那么这个类只能是抽象类
     *  9、抽象方法要被实现，所以不能是静态的，也不能是私有的。
     *  10、接口可继承接口，并可多继承接口，但类只能单根继承。
     */
}

/**
 * 抽象类中的方法可以是抽象方法，如果是抽象方法的话不需要方法体
 * 也可以是普通方法
 * 所以如果包含抽象方法，那么这一定是一个抽象类；
 */
abstract class Animal{

 abstract public void eat();

 public void sleep(){
     System.out.println("animal is sleeping");
 }
}

/**
 * 如果继承抽象类，那他的抽象方法一定要实现，普通方法可以不重写
 */
 class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("dog is eating");
    }
}
