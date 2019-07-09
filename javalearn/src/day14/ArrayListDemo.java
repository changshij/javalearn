package day14;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/17 14:58
 */
public class ArrayListDemo {
    public static void main(String[] args) {

        //创建一个Array List集合对象
        ArrayList al = new ArrayList();
        //添加Person对象到集合中，其实集合中记录的是对象的引用。
        al.add(new Person("csj", 28));
        al.add(new Person("Lucy1", 22));
        al.add(new Person("Lucy2", 24));
        al.add(new Person("Lucy3", 26));

        //取出所有Person对象
        for(Iterator it = al.iterator(); it.hasNext();) {
            Person p = (Person) it.next();
//            System.out.println(it.next());
            System.out.println("name=" + p.getName() + ";age=" + p.getAge());//只获取姓名

        }

    }
}
