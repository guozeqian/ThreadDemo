package com.ame.baozi;

public class DemoMain {
    public static void main(String[] args) {

        //等待唤醒案例
        BaoZi bz = new BaoZi();
        ChiKe ch = new ChiKe("吃客", bz);
        BaoZiPu bzp = new BaoZiPu("包子铺", bz);
        ch.start();
        bzp.start();
    }
}
