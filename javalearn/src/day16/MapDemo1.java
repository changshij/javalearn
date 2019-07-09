package day16;

import java.util.HashMap;
import java.util.Map;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/20 10:37
 */
public class MapDemo1 {
    public static void main(String[] args) {

        /*
        Map集合。
        1，Map集合中存储的是一对元素，键和值。
        2，必须保证键的唯一性。
        3，如果存储键相同，值会覆盖。
         */
        //需求：将学号和对应的学生姓名进行存储

        Map<Integer, String> map = new HashMap<Integer, String>();
        //存储键值对。
        map.put(1, "xioaming");
        map.put(3, "xioahong");
        map.put(2, "xioawang");
        map.put(8, "xioazhang");

        System.out.println(map.get(3));//xioahong
        System.out.println(map.put(3, "xiaohua"));//xioahong
        System.out.println(map.get(3));//xiaohua
//        System.out.println(map);

    }
}
