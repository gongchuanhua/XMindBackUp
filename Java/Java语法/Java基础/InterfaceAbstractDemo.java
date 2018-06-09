package com.java.day120;

/**
 * 〈一句话功能简述〉
 * 〈同时继承与实现〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/8
 */
public class InterfaceAbstractDemo {
    public static void main(String[] args) {
        InterfaceAbstractDemo3 iad = new InterfaceAbstractDemo3();
        iad.printAge();
        iad.printName();
    }
}
abstract class InterfaceAbstractDemo1{
    public abstract void printName();
}
interface InterfaceAbstractDemo2{
    void printAge();
}
class InterfaceAbstractDemo3 extends InterfaceAbstractDemo1 implements InterfaceAbstractDemo2{
    @Override
    public void printName() {
        System.out.println("My name is Jack");
    }

    @Override
    public void printAge() {
        System.out.println("My age is 19");
    }
}