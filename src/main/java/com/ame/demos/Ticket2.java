package com.ame.demos;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Ticket2 {
    private int ticket = 100;
    Lock lock = new ReentrantLock();

    public void run() {
        while (true) {
            lock.lock();
            if (ticket > 0) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {

                    e.printStackTrace();
                }
                String name = Thread.currentThread().getName();
                System.out.println(name + ":" + ticket);
            }
            lock.unlock();
        }
    }
}
