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
        * ��ѧ�������ѧ���Ĺ����ش洢��Hash Map�����С�
        * ����ѧ������ͬ������Ϊͬһ�� */
        //1������һ��HashMap���϶���
        HashMap<Student, String> hm = new HashMap<Student,String>();

        //2����ѧ������͹����ش洢�������С�
        hm.put(new Student("xiaoming", 20), "����");
        hm.put(new Student("abcd", 21), "�Ͼ�");
        hm.put(new Student("wangcai", 19), "�Ϻ�");
        hm.put(new Student("caige", 22), "�ɶ�");
        hm.put(new Student("abcd", 21), "����");

        //3��ȡ��map����������Ԫ�أ�ͨ��keyset��ʽ
//        Set<Student> keySet = hm.keySet();
//        Iterator<Student> it keySet.iterator();
        //����
        Iterator<Student> it = hm.keySet().iterator();
        while(it.hasNext()) {
            Student key = it.next();
            String value = hm.get(key);
            System.out.println(key.getName() + ":" + key.getAge()
            + ":" + value);
        }

    }
}
