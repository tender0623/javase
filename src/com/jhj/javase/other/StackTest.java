package com.jhj.javase.other;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 * Created by Administrator on 2020/1/5.
 */
public class StackTest {
    public static void main(String[] args) {
        method();
    }

    private static void mehod1() {
        Stack<String> stack = new Stack<>();
        stack.push("熊大");
        stack.push("熊二");
        stack.push("光头强");
        for (String o : stack) {
            System.out.println(o);
            /*
            熊大
            熊二
            光头强
             */
        }
        stack.pop();//先进后出,栈顶元素先出栈
        for (String o : stack) {
            System.out.println(o);
        }
        /*
        熊大
        熊二
        光头强
        熊大
        熊二
         */
    }

    public static void method(){
        Queue<String> queue = new LinkedList<>();
        //入队
        queue.offer("a");
        queue.offer("b");
        queue.offer("c");
        queue.offer("d");
        for (String s : queue) {
            System.out.println(s);
        }
        queue.poll();
        System.out.println("-------------------------");
        for (String s : queue) {
            System.out.println(s);
        }
    }
}
