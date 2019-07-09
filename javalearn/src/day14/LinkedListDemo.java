package day14;

import java.util.LinkedList;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/17 15:14
 */
public class LinkedListDemo {
    public static void main(String[] args) {

        //LinkedList演示,特有
        //addFirst() addLast()
        //getFirst() getLast()
        //removeFirst() removeLast()
        //创建一个链表对象
        LinkedList link = new LinkedList();
        link.addFirst("csj1");
        link.addFirst("csj2");
        link.addFirst("csj3");

//        System.out.println(link.getFirst());
//        System.out.println(link.removeFirst());//会返回操作的元素
//        System.out.println(link.getFirst());
//        System.out.println(link);

        while (!link.isEmpty())
            System.out.println("link:" + link.removeLast());

    }
}
