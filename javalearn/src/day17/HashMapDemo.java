/**
 * FileName: HashMapDemo
 * Author:   csj
 * Date:     2019/7/8 14:30
 * Description:
 */
package day17;

import java.util.HashMap;
import java.util.Iterator;

public class HashMapDemo {
    public static void main(String[] args) {
        /*
        * 将学生对象和学生的归属地存储到Hash Map集合中。
        * 对于学生对象，同年龄是为同一人 */
        //1，创建一个HashMap集合对象
        HashMap<Student, String> hm = new HashMap<Student,String>();

        //2，将学生对象和归属地存储到集合中。
        hm.put(new Student("xiaoming", 20), "北京");
        hm.put(new Student("abcd", 21), "南京");
        hm.put(new Student("wangcai", 19), "上海");
        hm.put(new Student("caige", 22), "成都");
        hm.put(new Student("abcd", 21), "铁岭");

        //3，取出map集合中所有元素，通过keyset方式
//        Set<Student> keySet = hm.keySet();
//        Iterator<Student> it keySet.iterator();
        //或者
        Iterator<Student> it = hm.keySet().iterator();
        while(it.hasNext()) {
            Student key = it.next();
            String value = hm.get(key);
            System.out.println(key.getName() + ":" + key.getAge()
            + ":" + value);
        }

    }
}
