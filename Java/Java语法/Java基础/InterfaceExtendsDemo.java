package com.java.day120;

/**
 * 〈一句话功能简述〉
 * 〈多个接口的继承〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/8
 */
public class InterfaceExtendsDemo {
    public static void main(String[] args) {
        InterfaceExtendsDemo4 ied = new InterfaceExtendsDemo4();
        ied.printAge();
        ied.printMessage();
        ied.printName();
    }
}
interface InterfaceExtendsDemo1{
    void printMessage();
}
interface InterfaceExtendsDemo2{
    void printName();
}

/**
 * 接口之间的继承
 */
interface InterfaceExtendsDemo3 extends InterfaceExtendsDemo1,InterfaceExtendsDemo2{
    void printAge();
}
class InterfaceExtendsDemo4 implements InterfaceExtendsDemo3{
    @Override
    public void printAge() {
        System.out.println("My age is 18");
    }

    @Override
    public void printName() {
        System.out.println("My name is Jack");
    }

    @Override
    public void printMessage() {
        System.out.println("My age is 19 and my name is Jack！");
    }
}