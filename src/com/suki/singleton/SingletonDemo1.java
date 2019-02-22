package com.suki.singleton;

/**
 * 测试饿汉式单例模式
 */
public class SingletonDemo1 {
    // 加载类时，天然是线程安全的
    private static SingletonDemo1 instance = new SingletonDemo1(); // 类初始化时立即加载这个对象(因此也没有延时加载优势)；所以称为饿汉式

    private SingletonDemo1(){

    }

    // 方法没有同步，调用效率高
    public static SingletonDemo1 getInstance(){
        return instance;
    }
}

class Test{
    public static void main(String[] args) {
        SingletonDemo1 s1 = SingletonDemo1.getInstance();
        SingletonDemo1 s2 = SingletonDemo1.getInstance();
        System.out.println(s1 == s2); // 返回true
    }
}
