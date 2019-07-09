package day11;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/3 18:20
 */
/*
通过4个窗口将100张票卖出
 */
class Ticket extends Thread {
    private int num = 10;
    public void run() {
        sale();
    }
    public void sale() {
        while(true) {
            if(num > 0) {
                System.out.println("ThreadName--" +
                        Thread.currentThread().getName() +
                        "...sale:" + num--);
            } else {
                return;
            }
        }
    }
}
public class ThreadDemo2 {
    public static void main(String[] args) {
        //创建四个线程
        Ticket t1 = new Ticket();
        Ticket t2 = new Ticket();
        Ticket t3 = new Ticket();
        Ticket t4 = new Ticket();
        //开启线程
        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}
