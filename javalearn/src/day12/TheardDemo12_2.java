package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/12 16:39
 */
/*
�������ߺͶ������ߣ��ȴ����ѻ��ơ�
����������֮ǰҪ�жϱ�ʶ�����Ѻ�ҲҪ��֤�̻߳��ͷ�жϱ�ʶ��
���һ���ȫ���ȴ��̣߳���ֹ�������������
ȱ�㣺Ч�ʵ͡�
 */
class Resource12_2 {
    //������Ʒ����
    private String name;
    //������Ʒ���
    private int count = 1;
    //���������ж��Ƿ�����Ʒ�ı��
    private boolean flag = false;

    public synchronized void set(String name) {
//        if(flag)
        while (flag)//��ʱ����������������Ҫ�Ļ���NotifyδnotifyAll
            try{
                this.wait();
            } catch (Exception e) {

            }
        this.name = name + "--" + count;
        count ++;
        System.out.println(Thread.currentThread().getName() + "------�����ˣ�" + this.name);
        //����Ǹ�δtrue
        flag = true;
//        this.notify();//���ѵȴ��̡߳�
        this.notifyAll();//���ѵȴ��̡߳�
    }
    public synchronized void get() {
        while (!flag)
            try {
                this.wait();
            } catch (Exception e) {

            }
        System.out.println(Thread.currentThread().getName() + "------������..." + this.name);
        flag = false;
        this.notifyAll();
    }
}

//���������������
class Producer2 implements Runnable {
    private Resource12_2 r;
    Producer2(Resource12_2 r) {
        this.r = r;
    }
    public void run() {
        while(true) {
            r.set("����");
        }
    }
}
//���������ߵ�����
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
������������ʱ�����ѵ��̲߳�ȷ��������ʱ������Ҳ������
���ѷ������Ѻ���̲߳��жϱ�ǣ�ֱ������ִ�У�������ȷ���ԡ�
 */