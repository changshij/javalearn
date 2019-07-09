/**
 * FileName: ComperByName
 * Author:   csj
 * Date:     2019/7/8 15:34
 * Description:
 */
package day17;

import java.util.Comparator;

public class ComparatorByName implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int temp = o1.getName().compareTo(o2.getName());
        return temp == 0 ? o1.getAge() - o2.getAge() : temp;
    }
}
