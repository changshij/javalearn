package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/12 14:18
 */
/*
wait():可以让当前线程等待，这时的线程被临时存储到线程池中。
notify():唤醒线程池中任意一个等待的线程。
notifyAll():唤醒线程池中所有的等待的线程。
这些方法在使用时，必须定义在同步中，必须被所属同步的锁对象调用。
 */
//创建一个资源描述，资源中有name sex，用于存储数据。
class  Resource2 {
    String name;
    String sex;
    //定义标记，用于判断资源中是否有数据。
    boolean flag;
}
//定义一个输入任务，既然时线程任务，必须实现Runnable接口
class Input2 implements Runnable {
    private Resource2 r;
    Input2(Resource2 r) {
        this.r = r;
    }
    //覆盖run方法
    public void run() {
        //输入任务中必然要处理资源，要给资源中的name sex 赋值
        //需要对象，对象确定吗？不确定，传递进来就行了，输入任务一创建对象就必须有资源。
        //完全可以在构造时明确资源对象。
        int x = 0;
        while(true) {
            synchronized (r) {
                if (r.flag)
                    try { r.wait(); }catch (Exception e) {}
                if (x == 0) {
                    r.name = "小李";
                    r.sex = "男";
                } else {
                    r.name = "小红";
                    r.sex = "女";
                }
                //赋值后，将标记该未true，说明有值
                r.flag = true;
                //唤醒等待的线程
                r.notify();
            }
            x = (x + 1) % 2;
        }
    }
}
//定义一个输出任务，既然时线程任务，必须实现Runnable接口
class Output2 implements Runnable {
    private Resource2 r;
    Output2(Resource2 r) {
        this.r = r;
    }
    //覆盖run方法
    public void run() {
        while (true) {
            synchronized (r) {
                if(!r.flag)
                    try { r.wait(); } catch (Exception e) {}
                System.out.println(r.name + "-----" + r.sex);

                //赋值后，将标记该未true，说明有值
                r.flag = false;
                //唤醒等待的线程，其实就是唤醒输入线程。
                r.notify();
            }
        }
    }
}
public class TheardDemo_Resource2 {
    public static void main(String[] args) {

        //1，创建资源对象
        Resource2  r = new Resource2();
        //2，创建任务对象
        Input2 in = new Input2(r);
        Output2 out = new Output2(r);
        //3，创建线程对象
        Thread t1 = new Thread(in);
        Thread t2 = new Thread(out);
        //4，启动并运行线程
        t1.start();
        t2.start();
    }
}
