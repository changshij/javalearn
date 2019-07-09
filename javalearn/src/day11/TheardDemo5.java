package day11;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/4 14:15
 */
/*
同步的第二种表现形式：
同步函数

同步函数使用的锁应该是this

同步函数和同步代码块的区别？
同步函数使用的是固定锁this；
同步代码块使用的所是可以指定的。

静态同步函数使用的锁是什么？
就是所在类的类名.class  字节码文件对象
 */
class Ticket3 implements Runnable {
    private int num = 10;
    boolean flag = true;
    Object obj = new Object();
    public void run() {
        if(flag) {
            while(true) {
                synchronized (this) {//此处使用this保证同一个锁
//  静态同步函数用 synchronized (Ticket3.class-字节码文件) {//super.getClass()

                    if (num > 0) {
                        try {Thread.sleep(100);} catch (InterruptedException e) {};
                        System.out.println("ThreadName--" +
                                Thread.currentThread().getName() +
                                "...obj:" + num--);
                    }
                }
            }
        }
        else
            while(true) {
             this.sale();
            }
    }
    public synchronized void sale()//同步函数
    {
        if (num > 0) {
            try {Thread.sleep(100);} catch (InterruptedException e) {};
            System.out.println("ThreadName--" +
                    Thread.currentThread().getName() +
                    "...func:" + num--);
//            System.out.println("this=" + this);
        }
    }
}
public class TheardDemo5 {
    public static void main(String[] args) {
    //创建线程
        Ticket3 t = new Ticket3();

        System.out.println("t= " + t);
        Thread t1 = new Thread(t);//穿t进去就用t里的run方法，不传就用Theard的run方法。
        Thread t2 = new Thread(t);
//        Thread t3 = new Thread(t);
//        Thread t4 = new Thread(t);

        t1.start();
        try {Thread.sleep(100);} catch (InterruptedException e) {};
        t.flag = false;
        t2.start();
//        t3.start();
//        t4.start();
//        return;
    }
}
