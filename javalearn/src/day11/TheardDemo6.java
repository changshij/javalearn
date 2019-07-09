package day11;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/11 10:47
 */
/* 多线程时无安全隐患
//饿汉式
class Single {
    private static final Single s = new Single();
    private Single(){}
    public static Single getInstance() {
        return s;
    }
}*/
//懒汉式
/*
加同步关键字解决的是安全问题。
加双重判断，是为了提高效率。
 */
class Single {
    private static Single s = null;
    private Single() {}
//    public static Single getInstance() {多线程时存在安全隐患
/*    public static synchronized Single getInstance() {//加同步后，安全
        if(s = null)
            s = new Single();
        return s;
    }*/

    public static Single getInstance() {
        if(s == null) {
            synchronized (Single.class) {//同步代码块
                if(s == null)
                    s = new Single();
            }
        }
        return s;
    }
}
public class TheardDemo6 {
    public static void main(String[] args) {

    }
}
