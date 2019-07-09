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
    //������Ʒ����
    private String name;
    //������Ʒ���
    private int count = 1;
    //���������ж��Ƿ�����Ʒ�ı��
    private boolean flag = false;

    //����jdk1.5�汾���ԣ�����һ��������
    // ��ͬ������ʽ������Ҫ���ӵ���������ṩ����ʾ������
    final Lock lock = new ReentrantLock();//����һ��������
    //ͨ��lock����ȡ��������������Condition�����������ߵļ��Ӳ�����
    final Condition con = lock.newCondition();
    //�ٴ���һ���������������󣬸��������ߵļ��Ӳ�����
    final Condition con2 = lock.newCondition();

    public void set(String name) {
        //ͨ����������ʾ�Ļ�ȡ������
        lock.lock();
        try {
            while (flag)
                try{
                    con.await();
                } catch (Exception e) {}
            this.name = name + "--" + count;
            count ++;
            System.out.println(Thread.currentThread().getName() + "------�����ˣ�" + this.name);
            //����Ǹ�δtrue
            flag = true;
            con2.signal();//���ѵȴ��̡߳�����������
        } finally {
            //�ͷ���
            lock.unlock();//������finally�У���֤һ���ᱻ�ͷ�
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
            System.out.println(Thread.currentThread().getName() + "------������..." + this.name);
            flag = false;
            con.signal();//����������
        } finally {
            lock.unlock();
        }
    }
}

//���������������
class Producer3 implements Runnable {
    private Resource12_3 r;
    Producer3(Resource12_3 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.set("����");
        }
    }
}
//���������ߵ�����
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
