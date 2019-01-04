package com.ame.demos;

public class DemoMain {
    public static void main(String[] args) {
        //创建线程对象
        MyThread mt = new MyThread("线程001");
        mt.start();

        for (int i = 0; i < 100; i++) {
            System.out.println("main函数线程！" + i);
        }
    }
}
