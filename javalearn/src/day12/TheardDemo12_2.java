package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/12 16:39
 */
/*
多生产者和多消费者，等待唤醒机制。
生产和销售之前要判断标识，唤醒后也要保证线程会回头判断标识，
并且唤醒全部等待线程，防止死锁情况发生。
缺点：效率低。
 */
class Resource12_2 {
    //定义商品名字
    private String name;
    //定义商品编号
    private int count = 1;
    //定义用来判断是否有商品的标记
    private boolean flag = false;

    public synchronized void set(String name) {
//        if(flag)
        while (flag)//此时会产生死锁情况，需要改唤醒Notify未notifyAll
            try{
                this.wait();
            } catch (Exception e) {

            }
        this.name = name + "--" + count;
        count ++;
        System.out.println(Thread.currentThread().getName() + "------生产了，" + this.name);
        //将标记改未true
        flag = true;
//        this.notify();//唤醒等待线程。
        this.notifyAll();//唤醒等待线程。
    }
    public synchronized void get() {
        while (!flag)
            try {
                this.wait();
            } catch (Exception e) {

            }
        System.out.println(Thread.currentThread().getName() + "------消费了..." + this.name);
        flag = false;
        this.notifyAll();
    }
}

//定义生产这的任务
class Producer2 implements Runnable {
    private Resource12_2 r;
    Producer2(Resource12_2 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.set("蛋糕");
        }
    }
}
//定义消费者的任务
class Consumer2 implements Runnable {
    private Resource12_2 r;
    Consumer2(Resource12_2 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.get();
        }
    }
}
public class TheardDemo12_2 {
    public static void main(String[] args) {

        Resource12_2 r = new Resource12_2();
        Producer2 p = new Producer2(r);
        Consumer2 c = new Consumer2(r);
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

/*
多生产多消费时，唤醒的线程不确定，可能时生产方也可能是
消费方，唤醒后的线程不判断标记，直接往下执行，产生不确定性。
 */