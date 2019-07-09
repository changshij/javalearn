package day14;

import java.util.LinkedList;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/17 15:24
 */
public class LinkedListTest {
    public static void main(String[] args) {

        /*
        用LinkedList模拟堆栈或者队列数据结构。
        堆栈：先进后出。First In Last Out  FILO.
        队列：先进先出。First In First Out FIFO
         */
        //创建一个自定义的堆栈容器
        MyStack ms = new MyStack();
        ms.myAdd("asd1");
        ms.myAdd("asd2");
        ms.myAdd("asd3");
        while (ms.isNull())
            System.out.println(ms.myGet());
    }
}

//描述一个具备先进后出的数据结构堆栈
class MyStack {
    private LinkedList link;
    MyStack() {
        link = new LinkedList();
    }

    //提供一个存储元素的方法
    public void myAdd(Object obj) {
        link.addLast(obj);
    }
    //提供一个获取元素的方法
    public Object myGet() {
        return link.removeLast();
    }
    //判断容器中是否有元素
    public boolean isNull() {
        return link.isEmpty();
    }
}