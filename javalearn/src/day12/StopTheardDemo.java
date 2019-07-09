package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/13 13:47
 */

class StopThread implements Runnable {
    private boolean flag = true;
    public void run() {
        //线程任务中必然需要定义循环语句
        //只要定义变量控制住循环，就可以控制线程的结束
        while (flag) {
            try {
                wait();//如果线程被等待，是无法继续判断标记的。
            } catch (InterruptedException e) {
                System.out.println(Thread.currentThread().getName() + "Exception");
                flag = false;
            }
            System.out.println(Thread.currentThread().getName() + "......run");
        }
    }
    public void setFlag() {
        flag = false;
    }
}
public class StopTheardDemo {
    public static void main(String[] args) {
        StopThread st = new StopThread();
        Thread t1 = new Thread(st);
        Thread t2 = new Thread(st);

        t1.start();
        t2.setDaemon(true);//将t2标记成守护线程（后台线程）；前台线程结束后，后台线程自动结束。
        t2.start();
        int num = 0;

        while (true) {
            if(num++ == 50) {
//                st.setFlag();//当条件满足时，将线程任务中的标记改为false，让线程停止
                //对t1进行一次中断，将t1的冻结状态清楚，让其恢复执行权。
                t1.interrupt();
//                t2.interrupt();
                break;
            }
            System.out.println(Thread.currentThread().getName() + "......" + num);
        }
        System.out.println("over");
    }
}
