package day11;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/11 11:00
 */
//死锁示例
/*
同步的另一个弊端：
容易引发死锁。

开发时，尽量避免同步嵌套的情况。
 */
class Lock implements Runnable{
    private boolean flag;
    Lock(boolean flag) {
        this.flag = flag;
    }
    public void run() {
        if(flag) {
            synchronized (MyLock.LOCKA) {
                System.out.println("if locka");
                synchronized (MyLock.LOCKB) {
                    System.out.println("if lockb");
                }
            }
        }
        else {
            synchronized (MyLock.LOCKB) {
                System.out.println("else lockb");
                synchronized (MyLock.LOCKA) {
                    System.out.println("else locka");
                }
            }
        }
    }
}
class MyLock {
    public static final Object LOCKA = new Object();
    public static final Object LOCKB = new Object();
}
public class TheardDemo7 {
    public static void main(String[] args) {
        Lock d1 = new Lock(true);
        Lock d2 = new Lock(false);
        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);
        t1.start();
        t2.start();
    }
}
/*
执行过程不一定会发生死锁，想要一定发生可以用while循环把同步代码块包起来。
 */