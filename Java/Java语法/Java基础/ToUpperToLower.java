package com.java.day180602;

/**
 * 〈一句话功能简述〉
 * 〈字符的大小写相互装换〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/2
 */
public class ToUpperToLower {
    public static void main(String[] args) {
        char c = 'c';
        c = toUpperToLower(c);
        //b
        System.out.println(c);
    }
    /**
     * 输入大写字母则输出小写，反之亦然
     * @param c
     * @return char
     */
    public static char toUpperToLower(char c){
        if(c >= 97){
            c -= 32;
            return c;
        }else{
            c += 32;
            return c;
        }
    }
}