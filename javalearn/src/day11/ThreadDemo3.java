package day11;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/3 18:35
 */
/*
通过4个窗口将100张票卖出
 */
/*创建线程的第二种方式：实现Runnable接口
1,实现Runnable接口 ；
2,覆盖run方法;
3，通过Thread类创建线程对象；
4，将Runnable接口的子类对象作为实参传递给Thread类中的构造函数；
5，调用start方法开启线程，并运行runnable接口子类的run方法。

第二种实现Runnable接口创建线程思想：
将线程任务和线程对象进行了解耦，将线程任务单独封装成对象。
另外，实现Runnable接口可以避免单继承的局限性。
所有建议创建多线程，都用实现Rubbable接口的方式


线程任务对象实现规则；
线程对象使用规则；
*/
class Ticket1 implements Runnable {
    private int num = 10;
    public void run() {
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
public class ThreadDemo3 {
    public static void main(String[] args) {
        //创建线程
        Ticket1 t = new Ticket1();

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
/* Java提供的Theard类里的run方法简写
class Theard {
    private Runnable target;
    Theard(){};
    Thread(Runnable target) {
        this.target = target;
    }
    public void run() {
        if(target != null)
            target.run();
    }
    public void start() {
        run();
    }
}
class Student implements Runnable {
    public void run() {

    }
}
Student stu = new Student();
Theard t = new Theard(stu);
t.start();*/
