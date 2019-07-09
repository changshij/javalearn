package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/13 15:23
 */
/*
开发中常用的多线程方法
 */
public class TheardDemo2 {
    public static void main(String[] args) {
        new Thread() {
            public void run() {
                for(int x= 0; x < 20; x++) {
                    System.out.println("x = " + x);
                }
            }
        }.start();//开辟一条新的路径执行代码

        Runnable r = new Runnable() {
            @Override
            public void run() {
                for(int x= 0; x < 20; x++) {
                    System.out.println("y = " + x);
                }
            }
        };
        new Thread(r).start();
        for(int x= 0; x < 20; x++) {
            System.out.println("z = " + x);
        }
    }
}
