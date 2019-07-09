package day15;

import java.util.Comparator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 19:04
 */
public class ComparatorByLength implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = (String) o1;
        String s2 = (String) o2;
        int temp = s1.length() - s2.length();
        return temp == 0 ? s1.compareTo(s2) : temp;
    }
}
