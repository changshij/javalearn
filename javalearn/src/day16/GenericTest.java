package day16;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 16:34
 */
public class GenericTest {
    public static void main(String[] args) {

        ArrayList<String> al = new ArrayList<String>();

        al.add("asd1");
        al.add("asd2");
        al.add("asd3");
//        for(Iterator<String> it = al.iterator(); it.hasNext();)
//            System.out.println(it.next());
        ArrayList<Integer> al2 = new ArrayList<Integer>();

        al2.add(11);
        al2.add(22);
        al2.add(33);
        printCollection(al);
        printCollection(al2);
    }

    //建立一个专门打印集合元素的方法
    public static <T> void printCollection(Collection<T> al) {
        for(Iterator<T> it = al.iterator(); it.hasNext();)
            System.out.println(it.next());
    }
}
/*?代表通配符，可以接收所有类型
    public static void printCollection(Collection<?> coll) {
        for(Iterator<?> it = coll.iterator(); it.hasNext();)
            System.out.println(it.next().toString());
    }
}*/