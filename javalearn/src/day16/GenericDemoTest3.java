package day16;

import day14.Person;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/20 9:41
 */
public class GenericDemoTest3 {
    public static void main(String[] args) {

        /*
        了解下限API体现
        TreeSet(Comparator<? super E> comparator)
         */
        TreeSet<Student> ts = new TreeSet<Student>(new ComparetoByAge());
        ts.add(new Student("xiaom1", 19));
        ts.add(new Student("xiaom2", 16));
        ts.add(new Student("xiaom3", 17));


        TreeSet<Worker> ts2 = new TreeSet<Worker>(new ComparetoByAge());
        ts2.add(new Worker("dachui1", 20));
        ts2.add(new Worker("dachui4", 29));
        ts2.add(new Worker("dachui2", 25));
        Iterator<Worker> it = ts2.iterator();
        while (it.hasNext()) {
            Worker s = it.next();
            System.out.println(s);
        }
    }
}
//泛型变成Person后，可以比较Person以及它的子类
//class ComparetoByAge implements Comparator<Student> {
class ComparetoByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        int temp = o1.getAge() - o2.getAge();
        return temp == 0 ? o1.getName().compareTo(o2.getName()) : temp;
    }
}
class MyTreeSet<T> {
//    MyTreeSet(Comparator<T> comp) {
    MyTreeSet(Comparator<? super T> comp) {

    }
}