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
        获取Map中的所有键值.
        Map集合取出所有元素的原理：将map转成set，在使用迭代器。
         */
        Map<String,String> map = new HashMap<String, String>();
        map.put("zhangsan", "北京");
        map.put("lisi", "上海");
        map.put("wangwu", "成都");
        map.put("zhaoliu", "广州");

//        System.out.println(map);

        //第一种方式：获取map集合中的键的集合。keySet();
//        Set<String> keySet = map.keySet();

        //通过set集合获取迭代器。
//        for(Iterator<String> it = keySet.iterator(); it.hasNext();) {
//            System.out.println(it.next());
//            String key = it.next();
//            String value = map.get(key);
//            System.out.println("key = " + key + "; value = " + value);
//        }

        //第二种方式：
        // 获取map集合中所有的键值关系集合，entrySet,键值关系的类型是Map.Entry
//        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        //迭代器取出所有的关系对象
//        Iterator<Map.Entry<String, String>> it = entrySet.iterator();
//        while (it.hasNext()) {
//            Map.Entry<String, String> me = it.next();
//            System.out.println(me);
//            System.out.println(me.getKey() + " : " + me.getValue());
//        }

        //第三种方式：获取值的集合。value();
        Collection<String> value = map.values();
        Iterator<String> it = value.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
interface MyMap {
    public static interface MyEntry {//内部接口

    }
}
class Demo5 implements MyMap.MyEntry {

}