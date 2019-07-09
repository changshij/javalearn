package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/11 15:23
 */
/*
多线程间通信：多个线程处理同一资源，但是处理动作却不同。
 *//*
//创建一个资源描述，资源中有name sex，用于存储数据。
class  Resource {
    String name;
    String sex;
}
//定义一个输入任务，既然时线程任务，必须实现Runnable接口
class Input implements Runnable {
    private Resource r;
    Input(Resource r) {
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
                r.name = "小李";
                r.sex = "男";
            } else {
                r.name = "小红";
                r.sex = "女";
            }
            x = (x+1)%2;
        }
    }
}
//定义一个输出任务，既然时线程任务，必须实现Runnable接口
class Output implements Runnable {
    private Resource r;
    Output(Resource r) {
        this.r = r;
    }
    //覆盖run方法
    public void run() {
        while (true) {
            System.out.println(r.name + "-----" + r.sex);
        }
    }
}*/
public class TheardDemo_Resource {
   static void main(String[] args) {
    /*    //1，创建资源对象
       Resource  r = new Resource();
       //2，创建任务对象
       Input in = new Input(r);
       Output out = new Output(r);
       //3，创建线程对象
       Thread t1 = new Thread(in);
       Thread t2 = new Thread(out);
       //4，启动并运行线程
       t1.start();
       t2.start();*/
    }
}

