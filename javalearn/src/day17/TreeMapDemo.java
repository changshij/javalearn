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
         * ��ʾTreeMap����
         */
        //1������TreeMap����
//        TreeMap<Student, String> tm = new TreeMap<Student, String>();
        //�����������򣬴���һ���Ƚ�������
        TreeMap<Student, String> tm = new TreeMap<Student, String>(new ComparatorByName());

        tm.put(new Student("xiaoming", 20), "����");
        tm.put(new Student("abcd", 21), "�Ͼ�");
        tm.put(new Student("wangcai", 19), "�Ϻ�");
        tm.put(new Student("caige", 22), "�ɶ�");
        tm.put(new Student("abcd", 21), "����");

        //ȡ�������е�Ԫ�ء�entrySet()
//        Set<Map.Entry<Student,String>> entrySet = tm.entrySet();
//        Iterator it = entrySet.iterator();
//����
        Iterator<Map.Entry<Student, String>> it = tm.entrySet().iterator();

        while(it.hasNext()) {
            Map.Entry<Student,String> me = it.next();
            Student key = me.getKey();
            String value = me.getValue();
            System.out.println(key.getName()+"::"+key.getAge()+"::"+value);
        }

    }
}
