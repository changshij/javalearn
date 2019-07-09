/**
 * FileName: TreeMapDemo
 * Author:   csj
 * Date:     2019/7/8 15:12
 * Description:
 */
package day17;

import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args) {

        /*
         * 演示TreeMap集合
         */
        //1，创建TreeMap集合
//        TreeMap<Student, String> tm = new TreeMap<Student, String>();
        //根据姓名排序，传入一个比较器对象
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new ComparatorByName());

        tm.put(new Student("xiaoming", 20), "北京");
        tm.put(new Student("abcd", 21), "南京");
        tm.put(new Student("wangcai", 19), "上海");
        tm.put(new Student("caige", 22), "成都");
        tm.put(new Student("abcd", 21), "铁岭");

        //取出集合中的元素。entrySet()
//        Set<Map.Entry<Student,String>> entrySet = tm.entrySet();
//        Iterator it = entrySet.iterator();
//或者
        Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Student,String> me = it.next();
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+"::"+key.getAge()+"::"+value);
        }

    }
}
