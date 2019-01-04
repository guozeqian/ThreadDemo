package com.ame.demos;

public class NoNameInnerClassThread {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            public void run() {
                for (int i = 0; i < 100; i++) {
                    System.out.println("循环第：" + i + "次");
                }
            }
        };
        new Thread(r).start();
    }
}
