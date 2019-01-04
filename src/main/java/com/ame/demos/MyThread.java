package com.ame.demos;

public class MyThread extends Thread {

    public MyThread(String name) {
        //调用父类的string参数构造方法，指定线程名称
        super(name);
    }

    /**
     * 重写run方法，完成该线程执行的逻辑
     * ame
     * 2019/1/3 17:32
     */
    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(getName() + "正在执行！" + i);
        }
    }
}
