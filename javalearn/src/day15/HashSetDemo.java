package day15;

import day14.Person;

import java.util.HashSet;
import java.util.Iterator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 14:10
 */
public class HashSetDemo {
    public static void main(String[] args) {
       /* //创建一个hashSet集合
        HashSet hs = new HashSet();
        hs.add("asd");
        hs.add("lmn");
        hs.add("lmm");
        hs.add("csj");
        hs.add("csj");//重复数据不存储
        for(Iterator it = hs.iterator(); it.hasNext();) {
            System.out.println(it.next().hashCode());
        }
*/

        HashSet hs = new HashSet();
        //同名同龄视为同一人；存储到哈希表时时根据对象来算哈希值的，不是根据姓名、年龄，
        //所以我们要再Person对象中建立自己的哈希算法和判断对象内容相同的依据。
        //记住：存储到哈希表中的对象，必须覆盖hashCode和equals方法，
        // 建立在哈希表判断元素唯一性的方式。

        hs.add(new Person("Lucy1",26));
        hs.add(new Person("Lcuy1",26));
        hs.add(new Person("Lucy5",22));
        hs.add(new Person("Lucy5",22));

        for(Iterator it = hs.iterator(); it.hasNext();) {
            Person p = (Person) it.next();
            System.out.println(p.getName() + "--" + p.getAge());
        }
    }
}
/*out
覆盖hashCode和equals方法前：
Preson{name='Lucy5', age=22}
Preson{name='Lucy5', age=22}
Preson{name='Lucy1', age=26}
Preson{name='Lcuy1', age=26}
覆盖hashCode和equals方法后：
Preson{name='Lucy1', age=26}
Preson{name='Lucy5', age=22}
Preson{name='Lcuy1', age=26}
 */