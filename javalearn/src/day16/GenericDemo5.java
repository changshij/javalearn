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
        ���͵��޶�
        ? extends E:�ܽ���E���ͻ���E��������
        ? suoer E:�ܽ���E���ͻ���E�ĸ�����
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
//        show(al2);Error:(30, 14) java: �����ݵ�����: java.util.ArrayList<day16.Student>�޷�ת��Ϊjava.util.Collection<? super day16.Worker>

        ArrayList<String> al3 = new ArrayList<String>();
        al3.add("asd1");
        al3.add("asd2");
        al3.add("asd3");
//        show(al3);Error:(36, 14) java: �����ݵ�����: java.util.ArrayList<java.lang.String>�޷�ת��Ϊjava.util.Collection<? extends day14.Person>

        ArrayList<Worker> al4 = new ArrayList<Worker>();
        al4.add(new Worker("С��1", 22));
        al4.add(new Worker("С��2", 23));
        al4.add(new Worker("С��3", 24));
        show(al4);

    }
    //�޶���Person���������
//    public static void show(Collection<? extends Person> coll) {
    //�޶�Worker����ԣ�Worker�ĸ���Ҳ����
    public static void show(Collection<? super Worker> coll) {
        for(Iterator<? super Worker> it = coll.iterator(); it.hasNext();) {
            System.out.println(it.next());
        }
    }
}
