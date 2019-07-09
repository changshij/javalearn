package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/11 16:44
 */
/*
���̼߳�ͨ�ţ�����̴߳���ͬһ��Դ�����Ǵ�����ȴ��ͬ��
 */
//����һ����Դ��������Դ����name sex�����ڴ洢���ݡ�
class  Resource {
    String name;
    String sex;
}/*
//����һ���������񣬼�Ȼʱ�߳����񣬱���ʵ��Runnable�ӿ�
class Input implements Runnable {
    private Resource r;
    Input(Resource r) {
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
                r.name = "С��";
                r.sex = "��";
            } else {
                r.name = "С��";
                r.sex = "Ů";
            }
            x = (x+1)%2;
        }
    }
}
//����һ��������񣬼�Ȼʱ�߳����񣬱���ʵ��Runnable�ӿ�
class Output implements Runnable {
    private Resource r;
    Output(Resource r) {
        this.r = r;
    }
    //����run����
    public void run() {
        while (true) {
            System.out.println(r.name + "-----" + r.sex);
        }
    }
}*/
/*δͬ��ǰ
�����С��-----Ů
С��-----Ů
С��-----Ů
С��-----Ů
С��-----��
�ȵȣ���
 */

//����һ���������񣬼�Ȼʱ�߳����񣬱���ʵ��Runnable�ӿ�
class Input implements Runnable {
    private Resource r;
    Input(Resource r) {
        this.r = r;
    }
    //����run����
    public void run() {
        //���������б�ȻҪ������Դ��Ҫ����Դ�е�name sex ��ֵ
        //��Ҫ���󣬶���ȷ���𣿲�ȷ�������ݽ��������ˣ���������һ��������ͱ�������Դ��
        //��ȫ�����ڹ���ʱ��ȷ��Դ����
        int x = 0;
        while(true) {
            synchronized (r) {
                if (x == 0) {
                    r.name = "С��";
                    r.sex = "��";
                } else {
                    r.name = "С��";
                    r.sex = "Ů";
                }
                x = (x + 1) % 2;
            }
        }
    }
}
//����һ��������񣬼�Ȼʱ�߳����񣬱���ʵ��Runnable�ӿ�
class Output implements Runnable {
    private Resource r;
    Output(Resource r) {
        this.r = r;
    }
    //����run����
    public void run() {
        while (true) {
            synchronized (r) {
                System.out.println(r.name + "-----" + r.sex);
            }
        }
    }
}
/*Ҫ��֤��������ͬ���������ͬһ����*/
public class TheardResource {
    public static void main(String[] args) {
        //1��������Դ����
        Resource  r = new Resource();
        //2�������������
        Input in = new Input(r);
        Output out = new Output(r);
        //3�������̶߳���
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        //4�������������߳�
        t1.start();
        t2.start();
    }
}
