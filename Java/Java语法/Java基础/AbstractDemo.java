package com.java.day120;

/**
 * 〈一句话功能简述〉
 * 〈抽象类与抽象方法〉
 *
 * @author EMGuns
 * @version 1.0.0
 * @date 2018/6/8
 */
public class AbstractDemo {
    public static void main(String[] args) {
        Developer d = new JavaDeveloper();
        d.work();
    }
}
abstract class Developer{
    /**
     * 抽象类无方法主体
     */
    public abstract void work();
}
class JavaDeveloper extends Developer{
    @Override
    public void work() {
        System.out.println("Java工程师工作");
    }
}
class PHPDeveloper extends Developer{
    @Override
    public void work() {
        System.out.println("PHP工程师工作");
    }
}