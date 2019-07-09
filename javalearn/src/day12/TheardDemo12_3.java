package day12;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/12 17:37
 */
/*

 */
class Resource12_3 {
    //定义商品名字
    private String name;
    //定义商品编号
    private int count = 1;
    //定义用来判断是否有商品的标记
    private boolean flag = false;

    //根据jdk1.5版本特性，创建一个锁对象，
    // 比同步的隐式锁操作要更加的面向对象，提供了显示操作。
    final Lock lock = new ReentrantLock();//创建一个互斥锁
    //通过lock锁获取监视器方法对象。Condition，负责生产者的监视操作。
    final Condition con = lock.newCondition();
    //再创建一个监视器方法对象，负责消费者的监视操作。
    final Condition con2 = lock.newCondition();

    public void set(String name) {
        //通过锁对象，显示的获取锁操作
        lock.lock();
        try {
            while (flag)
                try{
                    con.await();
                } catch (Exception e) {}
            this.name = name + "--" + count;
            count ++;
            System.out.println(Thread.currentThread().getName() + "------生产了，" + this.name);
            //将标记改未true
            flag = true;
            con2.signal();//唤醒等待线程。唤醒消费者
        } finally {
            //释放锁
            lock.unlock();//定义在finally中，保证一定会被释放
        }
    }
    public void get() {
        lock.lock();
        try {
            while (!flag)
                try {
                    con2.await();
                } catch (Exception e) {

                }
            System.out.println(Thread.currentThread().getName() + "------消费了..." + this.name);
            flag = false;
            con.signal();//唤醒生产者
        } finally {
            lock.unlock();
        }
    }
}

//定义生产这的任务
class Producer3 implements Runnable {
    private Resource12_3 r;
    Producer3(Resource12_3 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.set("蛋糕");
        }
    }
}
//定义消费者的任务
class Consumer3 implements Runnable {
    private Resource12_3 r;
    Consumer3(Resource12_3 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.get();
        }
    }
}
public class TheardDemo12_3 {
    public static void main(String[] args) {

        Resource12_3 r = new Resource12_3();
        Producer3 p = new Producer3(r);
        Consumer3 c = new Consumer3(r);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(p);
        Thread t3 = new Thread(c);
        Thread t4 = new Thread(c);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
    }
}
