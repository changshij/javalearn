package day16;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/22 9:50
 */
public class MapDemo2 {
    public static void main(String[] args) {

        /*
        ��ȡMap�е����м�ֵ.
        Map����ȡ������Ԫ�ص�ԭ����mapת��set����ʹ�õ�������
         */
        Map<String,String> map = new HashMap<String, String>();
        map.put("zhangsan", "����");
        map.put("lisi", "�Ϻ�");
        map.put("wangwu", "�ɶ�");
        map.put("zhaoliu", "����");

//        System.out.println(map);

        //��һ�ַ�ʽ����ȡmap�����еļ��ļ��ϡ�keySet();
//        Set<String> keySet = map.keySet();

        //ͨ��set���ϻ�ȡ��������
//        for(Iterator<String> it = keySet.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//            String key = it.next();
//            String value = map.get(key);
//            System.out.println("key = " + key + "; value = " + value);
//        }

        //�ڶ��ַ�ʽ��
        // ��ȡmap���������еļ�ֵ��ϵ���ϣ�entrySet,��ֵ��ϵ��������Map.Entry
//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //������ȡ�����еĹ�ϵ����
//        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> me = it.next();
//            System.out.println(me);
//            System.out.println(me.getKey() + " : " + me.getValue());
//        }

        //�����ַ�ʽ����ȡֵ�ļ��ϡ�value();
        Collection<String> value = map.values();
        Iterator<String> it = value.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
interface MyMap {
    public static interface MyEntry {//�ڲ��ӿ�

    }
}
class Demo5 implements MyMap.MyEntry {

}