package day12;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/13 13:40
 */
/*
sleep和wait的区别？
1，sleep必须指定时间，wait可指定可不指定。
2，都可以让线程处于冻结状态，释放执行权。
3，持有锁的线程执行sleep，不释放锁，持有锁的线程执行到wait释放锁。
4，sleep到时间自动醒，wait没有指定时间，只有被其他线程通过notify唤醒。
 */
public class SleepAndWait {
    public static void main(String[] args) {

    }
}
