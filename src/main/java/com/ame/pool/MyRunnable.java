package com.ame.pool;

public class MyRunnable implements Runnable {
    public void run() {
        try {
            Thread.sleep(2000);
        }catch (InterruptedException e){
            e.printStackTrace();
        }
        System.out.println("线程执行操作"+Thread.currentThread().getName());
    }
}
