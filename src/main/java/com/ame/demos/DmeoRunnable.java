package com.ame.demos;

public class DmeoRunnable {
    public static void main(String[] args) {
        //创建线程任务对象
        MyRunnable mr = new MyRunnable();
        //创建线程对象
        Thread t = new Thread(mr, "张三");
        t.start();
        ;
        for (int i = 0; i < 100; i++) {
            System.out.println("李四 " + i);
        }
    }
}
