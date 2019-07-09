package day14;

import java.util.ArrayList;
import java.util.List;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/17 13:48
 */
/*
Collection
     1--List
     2--Set
List:
1，是有序的；
2，元素是有索引的。
3，元素可以重复。
了解List接口的特有方法，注意：这些特有方法都是围绕着角标定义的。
1,add(index,element);
2,remove(index);
3,set(index,element);
4,get(index);
List接口支持增删改查操作。

List
  |--Vector:数组结构的，是同步的。被ArrayList替代了，因为效率低。
  |--ArrayList:数据结构数数组结构是不同步的。
  |--LinkedList:数据结构是链表结构，是不同步的。
 */
public class ListDemo {
    public static void main(String[] args) {

        //创建List集合的对象
        List list = new ArrayList();
        listDemo(list);

        //取出List中的所有元素
//        for(Iterator it = list.iterator();it.hasNext();)
//            System.out.println(it.next());

        //List特有的取出所有元素方式
        for(int i = 0; i < list.size(); i ++)
            System.out.println(list.get(i));


    }

    /*演示List接口*/
    public static void listDemo(List list) {
        //1,添加元素
        list.add("asd1");
        list.add("asd2");
        list.add("asd3");

        //2,增加元素
        list.add(1,"csj");
        //3,删除元素
        list.remove(0);
        //4.修改元素
        list.set(0,"csjcsj");
        //5，获取元素
        System.out.println(list.get(1));
        System.out.println(list);


    }
}
