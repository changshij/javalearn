package day15;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 19:37
 */
public class LinkedHasdSetDemo {
    public static void main(String[] args) {

//        HashSet hs = new HashSet();
        HashSet hs = new LinkedHashSet();//在哈希表基础上保证有序
        hs.add("csd");
        hs.add("asda");
        hs.add("fskhfl");

        for(Iterator it = hs.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
