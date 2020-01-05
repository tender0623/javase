package com.jhj.javase.ecodingdemo;

import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2020/1/5.
 */
public class EcodingTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String str ="我爱你中国";
        System.out.println(str.getBytes("GBK").length);
    }
}
