package com.java.day120;

/**
 * 〈一句话功能简述〉
 * 〈接口的多实现〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/8
 */
public class InterfaceDemo3 {
    public static void main(String[] args) {

    }
}
interface InterfaceDemo4{
    void printName(String name);
}
interface InterfaceDemo5{
    void printAge(int age);
}

/**
 * 接口的多实现
 */
class InterfaceDemo6 implements InterfaceDemo4,InterfaceDemo5{
    @Override
    public void printName(String name) {
        System.out.println("My name is "+name);
    }

    @Override
    public void printAge(int age) {
        System.out.println("My age is "+age);
    }
}