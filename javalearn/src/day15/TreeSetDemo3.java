package day15;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 18:58
 */
public class TreeSetDemo3 {
    public static void main(String[] args) {

//        TreeSet ts = new TreeSet();
        //练习：对字符串进行长度排序。
        //字符串本身具备自然排序，不是我们需要
        TreeSet ts = new TreeSet(new ComparatorByLength());

        ts.add("csj1");
        ts.add("csj12");
        ts.add("scj123");
        ts.add("jsc12");
        ts.add("haha");

        for(Iterator it = ts.iterator(); it.hasNext(); ) {
            System.out.println(it.next());
        }

    }
}
/*Out:TreeSet ts = new TreeSet();
csj1
csj12
haha
jsc12
scj123
TreeSet ts = new TreeSet(new ComparatorByLength());:
csj1
haha
csj12
jsc12
scj123

 */