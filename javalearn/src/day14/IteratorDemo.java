package day14;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/15 12:29
 */
public class IteratorDemo {
    public static void main(String[] args) {

        //创建容器对象
        Collection coll = new ArrayList();
        //添加元素
        coll.add("asd1");
        coll.add("asd2");
        coll.add("asd3");
        coll.add("asd4");

        //获取容器中的元素，必须要先获取容器中的迭代器。通过Iterator方法完成
//        Iterator i = coll.iterator();
//        while (i.hasNext())
//            System.out.println(i.next());
        for(Iterator it = coll.iterator(); it.hasNext();)//好处，用完会当作垃圾回收
            System.out.println(it.next());
    }

}
