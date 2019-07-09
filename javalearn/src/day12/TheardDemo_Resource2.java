package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/12 14:18
 */
/*
wait():�����õ�ǰ�̵߳ȴ�����ʱ���̱߳���ʱ�洢���̳߳��С�
notify():�����̳߳�������һ���ȴ����̡߳�
notifyAll():�����̳߳������еĵȴ����̡߳�
��Щ������ʹ��ʱ�����붨����ͬ���У����뱻����ͬ������������á�
 */
//����һ����Դ��������Դ����name sex�����ڴ洢���ݡ�
class  Resource2 {
    String name;
    String sex;
    //�����ǣ������ж���Դ���Ƿ������ݡ�
    boolean flag;
}
//����һ���������񣬼�Ȼʱ�߳����񣬱���ʵ��Runnable�ӿ�
class Input2 implements Runnable {
    private Resource2 r;
    Input2(Resource2 r) {
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
                if (r.flag)
                    try { r.wait(); }catch (Exception e) {}
                if (x == 0) {
                    r.name = "С��";
                    r.sex = "��";
                } else {
                    r.name = "С��";
                    r.sex = "Ů";
                }
                //��ֵ�󣬽���Ǹ�δtrue��˵����ֵ
                r.flag = true;
                //���ѵȴ����߳�
                r.notify();
            }
            x = (x + 1) % 2;
        }
    }
}
//����һ��������񣬼�Ȼʱ�߳����񣬱���ʵ��Runnable�ӿ�
class Output2 implements Runnable {
    private Resource2 r;
    Output2(Resource2 r) {
        this.r = r;
    }
    //����run����
    public void run() {
        while (true) {
            synchronized (r) {
                if(!r.flag)
                    try { r.wait(); } catch (Exception e) {}
                System.out.println(r.name + "-----" + r.sex);

                //��ֵ�󣬽���Ǹ�δtrue��˵����ֵ
                r.flag = false;
                //���ѵȴ����̣߳���ʵ���ǻ��������̡߳�
                r.notify();
            }
        }
    }
}
public class TheardDemo_Resource2 {
    public static void main(String[] args) {

        //1��������Դ����
        Resource2  r = new Resource2();
        //2�������������
        Input2 in = new Input2(r);
        Output2 out = new Output2(r);
        //3�������̶߳���
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        //4�������������߳�
        t1.start();
        t2.start();
    }
}
