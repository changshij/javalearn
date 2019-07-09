package day15;

import day14.Person;

import java.util.Comparator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 17:41
 */
//创建了一个比较器，按照person的姓名进行比较。
public class ComparatoByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        //根据Person的姓名进行比较，如果姓名相同，再次比较年龄。
        Person p1 = (Person)o1;
        Person p2 = (Person)o2;

        int temp = p1.getName().compareTo(p2.getName());

        return temp == 0 ? p1.getAge() - p2.getAge() : temp;
    }
}
