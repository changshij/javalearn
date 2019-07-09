package day16;

import day14.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 18:17
 */
public class GenericTest2 {
    public static void main(String[] args) {
/*
了解API中泛型的体现
boolean containsAll(Collection<?> c)
 */
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("asd1");
        a1.add("asd2");
        a1.add("asd3");

        ArrayList<String> a2 = new ArrayList<String>();
        a2.add("asd1");
        a2.add("asd2");

//        boolean b = a1.containsAll(a2);//是否包含
//        System.out.println(b);//true

        ArrayList<Integer> a3 = new ArrayList<Integer>();
        a3.add(55);
        a3.add(56);
        boolean b = a1.containsAll(a3);
        System.out.println(b);//false

        //演示API中的泛型上限。？extends E
        //boolean addAll(Collection<? extends E> c)
        ArrayList<Person> a4 = new ArrayList<Person>();
        a4.add(new Person("Lucy1", 22));
        a4.add(new Person("Lucy2", 23));
        a4.add(new Person("Lucy3", 24));

//        ArrayList<Person> a5 = new ArrayList<Person>();
//        a5.add(new Person("Like1", 22));
//        a5.add(new Person("Like2", 23));
//        a5.add(new Person("Like3", 24));
        ArrayList<Student> a5 = new ArrayList<Student>();
        a5.add(new Student("Like1", 22));
        a5.add(new Student("Like2", 23));
        a5.add(new Student("Like3", 24));

        a4.addAll(a5);
        Iterator<Person> it = a4.iterator();
        while(it.hasNext()) {
            System.out.println("a4 = " + it.next());
        }
    }
}

interface MyCollection<T> {
    boolean MyContaionAll(Collection<?> c);
    boolean addAll(MyCollection<T> c);
}
