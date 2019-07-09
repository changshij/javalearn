package day14;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/17 14:16
 */
public class ListIteratorDemo {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("asd1");
        list.add("asd2");
        list.add("asd3");

//        Iterator it = list.iterator();
        ListIterator it = list.listIterator();
        //列表迭代器是List集合的特有迭代器，可以实现迭代过程中的增删改查
        while(it.hasNext()) {
            Object obj = it.next();//Iterator时报异常：ConcurrentModificationException
            if(obj.equals("asd2"))
                it.add("asd9");
        }
        System.out.println(list);
    }
}
