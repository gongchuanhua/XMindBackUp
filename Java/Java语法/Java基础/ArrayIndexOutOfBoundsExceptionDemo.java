package com.java.day180602;

/**
 * 〈一句话功能简述〉
 * 〈数组下标越界异常〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/2
 */
public class ArrayIndexOutOfBoundsExceptionDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        //ArrayIndexOutOfBoundsException
        System.out.println(arr[10]);
    }
}