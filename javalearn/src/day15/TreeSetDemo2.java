package day15;

import day14.Person;

import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 17:38
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        //创建TreeSet集合时，直接在构造器中明确具体的比较器
        TreeSet hs = new TreeSet(new ComparatoByName());

        hs.add(new Person("aa",25));
        hs.add(new Person("ad",26));
        hs.add(new Person("sd",22));

        for(Iterator it = hs.iterator(); it.hasNext();) {
            Person p = (Person) it.next();
            System.out.println(p.getName() + "--" + p.getAge());
        }

    }
}
/*
TreeSet hs = new TreeSet();时输出：
sd--22
aa--25
ad--26
TreeSet hs = new TreeSet(new ComparatoByName());时输出：
aa--25
ad--26
sd--22
 */