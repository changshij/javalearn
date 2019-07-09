package day15;

import day14.Person;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 16:13
 */
public class TreeSetDemo {
    public static void main(String[] args) {

        TreeSet ts = new TreeSet();

//        ts.add("csj1");
////        ts.add("csj12");
////        ts.add("scj123");
////        ts.add("jsc12");
////        ts.add("haha");

        //按照Person的年龄从小到大排序
        //二叉树中判断元素是否相同是通过比较结构return 0，来完成的
        ts.add(new Person("asd", 23));//ClassCastException
        ts.add(new Person("aa", 22));
        ts.add(new Person("bd", 21));
        ts.add(new Person("bc", 21));
        for(Iterator it = ts.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}

