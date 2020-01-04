package com.jhj.javase.duotaiTest;

/**
 * Created by Administrator on 2020/1/5.
 */
public class DuoTaiTest {
    public static void main(String[] args) {
        Animal a = new Dog();
        a.eat();//编译看左边，运行看右边，如果子类重写了方法，则运行子类的方法
    }
    /**
     * 向上转型和向下转型
     * 在JAVA中，继承是一个重要的特征，通过extends关键字，子类可以复用父类的功能，
     * 如果父类不能满足当前子类的需求，则子类可以重写父类中的方法来加以扩展。
     * 在应用中就存在着两种转型方式，分别是：向上转型和向下转型。
     * 比如：父类Parent,子类Child
     * 向上转型：父类的引用指向子类对象Parent p=new Child();
     * 说明：向上转型时，子类对象当成父类对象，只能调用父类的功能，如果子类重写了父类的方法就根据这个引用指向调用子类重写方法。
     * 向下转型(较少)：子类的引用的指向子类对象，过程中必须要采取到强制转型。
     * Parent  p = new Child();//向上转型，此时，p是Parent类型
     * Child c = (Child)p;//此时，把Parent类型的p转成小类型Child
     * 其实，相当于创建了一个子类对象一样，可以用父类的，也可以用自己的
     * 说明：向下转型时，是为了方便使用子类的特殊方法，也就是说当子类方法做了功能拓展，就可以直接使用子类功能。
     *
     * 静态变量和示例变量
     *  在语法定义上：静态变量前面要加static关键字，而试炼变量前则不加
     *  在程序运行上：实例变量属于某个对象的属性，必须创建了实例对象，其中的实例变量才会被分配内存空间，才能使用这个实例变量；
     *  静态变量不属于某个对象，而是属于类，所以也称之为类变量，只要程序加载了类的字节码，不用创建任何实例对象，静态变量也会被分配内存空间
     *
     */
}
class Animal{
    public void eat(){
        System.out.println("我是动物在吃");
    }
}
class Dog extends Animal{
    @Override
    public void eat() {
        System.out.println("我是狗子在吃");
}
    }
