package day13;

/**
 * @author csj
 * @version v1.0
 * @date 3019/6/13 15:05
 */
//����һ����Դ��������Դ����name sex�����ڴ洢���ݡ�
class  Resource3 {
    private String name;
    private String sex;
    //�����ǣ������ж���Դ���Ƿ������ݡ�
    private boolean flag;

    //�����ṩ����������Щ����
    //�������������������������������ͬ��
    public synchronized void set(String name, String sex) {
        if(flag)
            try {
                this.wait();
            } catch (Exception e) {

            }
        this.name = name;
        this.sex = sex;
        flag = true;
        this.notify();
    }
    //�����ṩ��ȡ����
    public synchronized void out() {
        if(!flag)
            try {
                this.wait();
            }catch (Exception e) {

            }
        System.out.println(name + "......." + sex);
        flag = false;
        this.notify();
    }
}
//����һ���������񣬼�Ȼʱ�߳����񣬱���ʵ��Runnable�ӿ�
class Input3 implements Runnable {
    private Resource3 r;
    Input3(Resource3 r) {
        this.r = r;
    }
    //����run����
    public void run() {
        //���������б�ȻҪ������Դ��Ҫ����Դ�е�name sex ��ֵ
        //��Ҫ���󣬶���ȷ���𣿲�ȷ�������ݽ��������ˣ���������һ��������ͱ�������Դ��
        //��ȫ�����ڹ���ʱ��ȷ��Դ����
        int x = 0;
        while(true) {
            if (x == 0) {
                r.set("С��", "��");
            } else {
                r.set("Lucy", "weman");
            }
            x = (x + 1) % 2;
        }
    }
}
//����һ��������񣬼�Ȼʱ�߳����񣬱���ʵ��Runnable�ӿ�
class Output3 implements Runnable {
    private Resource3 r;
    Output3(Resource3 r) {
        this.r = r;
    }
    //����run����
    public void run() {
        while (true) {
            r.out();
        }
    }
}
public class TheardDemo_Resource3 {
    public static void main(String[] args) {
        //1��������Դ����
        Resource3  r = new Resource3();
        //3�������������
        Input3 in = new Input3(r);
        Output3 out = new Output3(r);
        //3�������̶߳���
        Thread t1 = new Thread(in);
        Thread t3 = new Thread(out);
        //4�������������߳�
        t1.start();
        t3.start();
    }
}
