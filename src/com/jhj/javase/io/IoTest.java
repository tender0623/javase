package com.jhj.javase.io;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by Administrator on 2020/1/5.
 */
public class IoTest {

    public static void main(String[] args) {
        method();
    }

    public static void method(){
        String path="E:\\Java\\javase\\test.doc";
        try {
            FileInputStream in = new FileInputStream(path);
            int b =0;
            while ((in.read())!=-1){
                System.out.println(b);
            }
            in.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
