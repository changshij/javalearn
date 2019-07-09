package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/13 14:59
 */
/*

 */
class Demo implements Runnable{
    private String name;
    Demo(String name) {
        this.name = name;
    }
    public void run() {
        for(int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + "..." + x + "..." + name);
        }
    }
}
public class TheardDemo_Join {
    public static void main(String[] args) {
        Demo d1 = new Demo("Lucy");
        Demo d2 = new Demo("����");

        Thread t1 = new Thread(d1);
        Thread t2 = new Thread(d2);

        t1.start();
        //������t1.join()����
        try {
            t1.join();//���̵߳ȴ�t1�߳���ֹ
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        t2.start();

        for(int x = 0; x < 100; x++) {
            System.out.println(Thread.currentThread().getName() + "..." + x);
        }
    }
}
