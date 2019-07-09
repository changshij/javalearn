package day13;

/**
 * @author csj
 * @version v1.0
 * @date 3019/6/13 15:05
 */
//创建一个资源描述，资源中有name sex，用于存储数据。
class  Resource3 {
    private String name;
    private String sex;
    //定义标记，用于判断资源中是否有数据。
    private boolean flag;

    //对外提供方法访问这些属性
    //分析共享数据在这里，可以在这里设置同步
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
    //对外提供获取方法
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
//定义一个输入任务，既然时线程任务，必须实现Runnable接口
class Input3 implements Runnable {
    private Resource3 r;
    Input3(Resource3 r) {
        this.r = r;
    }
    //覆盖run方法
    public void run() {
        //输入任务中必然要处理资源，要给资源中的name sex 赋值
        //需要对象，对象确定吗？不确定，传递进来就行了，输入任务一创建对象就必须有资源。
        //完全可以在构造时明确资源对象。
        int x = 0;
        while(true) {
            if (x == 0) {
                r.set("小李", "男");
            } else {
                r.set("Lucy", "weman");
            }
            x = (x + 1) % 2;
        }
    }
}
//定义一个输出任务，既然时线程任务，必须实现Runnable接口
class Output3 implements Runnable {
    private Resource3 r;
    Output3(Resource3 r) {
        this.r = r;
    }
    //覆盖run方法
    public void run() {
        while (true) {
            r.out();
        }
    }
}
public class TheardDemo_Resource3 {
    public static void main(String[] args) {
        //1，创建资源对象
        Resource3  r = new Resource3();
        //3，创建任务对象
        Input3 in = new Input3(r);
        Output3 out = new Output3(r);
        //3，创建线程对象
        Thread t1 = new Thread(in);
        Thread t3 = new Thread(out);
        //4，启动并运行线程
        t1.start();
        t3.start();
    }
}
