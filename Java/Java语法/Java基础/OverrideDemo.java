package com.java.day120;

/**
 * 〈一句话功能简述〉
 * 〈重写〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/8
 */
public class OverrideDemo {
    public static void main(String[] args) {
        FatherDemo fd = new SonDemo();
        fd.getNum(12);
    }
}
class FatherDemo{
    void getNum(int num){
        System.out.println("this is your num");
    }
}
class SonDemo extends FatherDemo{
    /**
     * 重写规则：子类权限修饰符必须大于等于父类权限修饰符
     *          子类的返回值类型、方法名、参数列表必须与父类相同
     * @param num
     */
    @Override
    public void getNum(int num) {
        System.out.println("this is my num");
    }
}