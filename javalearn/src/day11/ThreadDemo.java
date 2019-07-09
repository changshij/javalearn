package day11;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/3 10:06
 */
/*多线程*/
class Demo extends Thread {

    private String name;
    Demo(String name) {
//        this.name = name;
        super(name);
    }
    public void run() {
//        System.out.println(3/0);
        for(int x = 0; x < 3
                ; x++) {
//            System.out.println("name---" + x + "---" + name + "---Threadname = " + getName());
            System.out.println("name---" + x + "---Threadname = " + getName());
        }
    }
}
public class ThreadDemo {
    public static void main(String[] args) {

        Demo d1 = new Demo("Lucy");
        Demo d2 = new Demo("Jack");
        d1.start();
        d2.start();
        //获取当前线程对象的名称
        System.out.println("main Theardname = " + Thread.currentThread().getName());

    }
}
