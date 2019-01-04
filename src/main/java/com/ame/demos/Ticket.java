package com.ame.demos;

public class Ticket implements Runnable {
    private int ticket = 100;
    Object obj = new Object();

    public void run() {
        while (true) {
            synchronized (obj) {
                if (ticket > 0) {
                    try {
                        Thread.sleep(50);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + ":" + ticket);
                }
            }
        }

    }
}
