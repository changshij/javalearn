package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/12 15:48
 */
/*
�������ߺ͵������ߣ��ȴ����ѻ��ơ�

 */

class Resource12 {
    //������Ʒ����
    private String name;
    //������Ʒ���
    private int count = 1;
    //���������ж��Ƿ�����Ʒ�ı��
    private boolean flag = false;

    public synchronized void set(String name) {
        if(flag)
            try{
                this.wait();
            } catch (Exception e) {

            }
        this.name = name + "--" + count;
        count ++;
        System.out.println(Thread.currentThread().getName() + "�����ˣ�" + this.name);
        //����Ǹ�δtrue
        flag = true;
        this.notify();//���ѵȴ��̡߳�
    }
    public synchronized void get() {
        if(!flag)
            try {
                this.wait();
            } catch (Exception e) {

            }
        System.out.println(Thread.currentThread().getName() + "������..." + this.name);
            flag = false;
            this.notify();
    }
}

//���������������
class Producer implements Runnable {
    private Resource12 r;
    Producer(Resource12 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.set("����");
        }
    }
}
//���������ߵ�����
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
