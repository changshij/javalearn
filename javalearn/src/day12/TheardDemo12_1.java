package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/12 15:48
 */
/*
单生产者和单消费者，等待唤醒机制。

 */

class Resource12 {
    //定义商品名字
    private String name;
    //定义商品编号
    private int count = 1;
    //定义用来判断是否有商品的标记
    private boolean flag = false;

    public synchronized void set(String name) {
        if(flag)
            try{
                this.wait();
            } catch (Exception e) {

            }
        this.name = name + "--" + count;
        count ++;
        System.out.println(Thread.currentThread().getName() + "生产了，" + this.name);
        //将标记改未true
        flag = true;
        this.notify();//唤醒等待线程。
    }
    public synchronized void get() {
        if(!flag)
            try {
                this.wait();
            } catch (Exception e) {

            }
        System.out.println(Thread.currentThread().getName() + "消费了..." + this.name);
            flag = false;
            this.notify();
    }
}

//定义生产这的任务
class Producer implements Runnable {
    private Resource12 r;
    Producer(Resource12 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.set("蛋糕");
        }
    }
}
//定义消费者的任务
class Consumer implements Runnable {
    private Resource12 r;
    Consumer(Resource12 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.get();
        }
    }
}
public class TheardDemo12_1 {
    public static void main(String[] args) {

        Resource12 r = new Resource12();
        Producer p = new Producer(r);
        Consumer c = new Consumer(r);
        Thread t1 = new Thread(p);
        Thread t2 = new Thread(c);
        t1.start();
        t2.start();
    }
}
