package com.java.day120;

/**
 * 〈一句话功能简述〉
 * 〈接口学习〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/8
 */
public class InterfaceDemo {
    public static void main(String[] args) {
        InterfaceDemo1 id1 = new InterfaceDemo2();
        id1.getAge(19);
    }
}
interface InterfaceDemo1 {
    /**
     * 成员变量省略了public static final
     */
    int AGE = 19;

    /**
     * 方法省略了public abstract
     * @param age
     */
    void getAge(int age);
}
class InterfaceDemo2 implements InterfaceDemo1{
    @Override
    public void getAge(int age) {
        System.out.println("My age is "+age);
    }
}