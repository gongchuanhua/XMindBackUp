package com.java.day180602;

/**
 * 〈一句话功能简述〉
 * 〈空指针异常〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/2
 */
public class NullPointerExceptionDemo {
    public static void main(String[] args) {
        String[] arr = new String[5];
        arr[0] = null;
        System.out.println(arr[0].isEmpty());
    }
}