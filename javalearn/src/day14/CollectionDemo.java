package day14;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/15 11:21
 */
public class CollectionDemo {
    public static void main(String[] args) {
        /*
        演示Collection接口常见方法
         */

//        Collection coll = new ArrayList();
//        collectionDemo(coll);

        collectionAllDemo();
    }


    public static void collectionAllDemo() {
        //创建两个集合对象，并添加元素
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();

        ((ArrayList) c1).add("abc1");
        ((ArrayList) c1).add("abc2");
        ((ArrayList) c1).add("abc3");

        ((ArrayList) c2).add("csj1");
        ((ArrayList) c2).add("csj2");
        ((ArrayList) c2).add("csj3");

        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
        //添加集合
//        ((ArrayList) c1).add(1,c2);//将c2做为一个对象添加到c1中，从角标后开始添加
//        c1:[abc1, [csj1, csj2, csj3], abc2, abc3]
        ((ArrayList) c1).addAll(1,c2);//将c2中元素添加到c1中，从角标后开始添加
//        c1:[abc1, csj1, csj2, csj3, abc2, abc3]
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);

        //判断是否包含一个容器中的元素呢
        System.out.println(c1.containsAll(c2));//true

        //删除一个容器中的所有元素
//        boolean b = c1.removeAll(c2);//将c1中与c2相同的元素从c1中删除
//        System.out.println("c1.removeAll(c2):" + b);
//        System.out.println("c1:" + c1);
//        System.out.println("c2:" + c2);

        //取交集，c1没有变化为false
        boolean bb = c1.retainAll(c2);//将c1中与c2相同的元素保留到c1中，不同的被删除。
        System.out.println("c1.retainAll(c2):" + bb);
        System.out.println("c1:" + c1);
        System.out.println("c2:" + c2);
    }
    public static void collectionDemo(Collection coll) {
        //1，给容器中添加元素
        coll.add("abd1");
        coll.add("abd2");
        coll.add("abd3");
        //2，删除元素
        coll.remove("abd2");
        //3，清除元素，删全部。
        coll.clear();

        System.out.println(coll);
        System.out.println(coll.contains("abc1"));//包含abc1不？
        System.out.println(coll.isEmpty());//是否为空
        System.out.println(coll.size());
    }
}
