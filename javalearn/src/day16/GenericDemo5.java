package day16;

import day14.Person;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 17:05
 */
public class GenericDemo5 {
    public static void main(String[] args) {

        /*
        泛型的限定
        ? extends E:能接收E类型或者E的子类型
        ? suoer E:能接收E类型或者E的父类型
         */
        ArrayList<Person> al = new ArrayList<Person>();
        al.add(new Person("Lucy1", 22));
        al.add(new Person("Lucy2", 23));
        al.add(new Person("Lucy3", 24));
        show(al);

        ArrayList<Student> al2 = new ArrayList<Student>();
        al2.add(new Student("xiaom1", 22));
        al2.add(new Student("xiaom2", 23));
        al2.add(new Student("xiaom3", 24));
//        show(al2);Error:(30, 14) java: 不兼容的类型: java.util.ArrayList<day16.Student>无法转换为java.util.Collection<? super day16.Worker>

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("asd1");
        al3.add("asd2");
        al3.add("asd3");
//        show(al3);Error:(36, 14) java: 不兼容的类型: java.util.ArrayList<java.lang.String>无法转换为java.util.Collection<? extends day14.Person>

        ArrayList<Worker> al4 = new ArrayList<Worker>();
        al4.add(new Worker("小王1", 22));
        al4.add(new Worker("小王2", 23));
        al4.add(new Worker("小王3", 24));
        show(al4);

    }
    //限定是Person的子类对象
//    public static void show(Collection<? extends Person> coll) {
    //限定Worker类可以，Worker的父类也可以
    public static void show(Collection<? super Worker> coll) {
        for(Iterator<? super Worker> it = coll.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
