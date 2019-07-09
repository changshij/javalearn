package day11;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/4 10:33
 */
/*
线程安全问题。
原因：
1，多线程在同时处理共享数据；
2，线程任务中有多条代码在操作共享数据；
安全问题的成因就是：一个线程在通过多条操作共享数据的过程中，
其他线程参与了共享数据的操作，导致了数据的错误。

想要知道你的多线程程序有没有安全问题：
只要看线程任务中是否有多条代码在处理共享数据

解决：
一个线程在多条语句操作共享数据的过程中，不允许其他线程参与运算。
JAVA中提供了同步代码块进行引起安全问题的代码封装。
格式：
synchronized(对象)
{
    需要被同步的代码；
}

同步：
好处：解决了多线程的安全问题。
缺点：降低了效率。

同步的前提：
    1，至少有两个线程在同步中；
    2，必须保证同步使用的是同一个锁。
 */
class Ticket2 implements Runnable {
    private int num = 10;
    Object obj = new Object();
    public void run() {
        while(true) {
            //将这两句封装成一个整体
            synchronized (obj) {
                if (num > 0) {
//                try {
                    //让线程在这里小睡，导致了0 -1等错误票的产生，导致线程安全问题。
//                    Thread.sleep(10);
//                } catch (InterruptedException e) {
//                    System.out.println(e.getMessage());
//                }
                    System.out.println("ThreadName--" +
                            Thread.currentThread().getName() +
                            "...sale:" + num--);
                } else {
                    return;
                }
            }
        }
    }
}
public class TheardDemo4 {
    public static void main(String[] args) {
        //创建线程
        Ticket2 t = new Ticket2();

        Thread t1 = new Thread(t);//穿t进去就用t里的run方法，不传就用Theard的run方法。
        Thread t2 = new Thread(t);
        Thread t3 = new Thread(t);
        Thread t4 = new Thread(t);

        t1.start();
        t2.start();
        t3.start();
        t4.start();

    }
}

