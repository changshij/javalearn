/**
 * FileName: Maptest
 * Author:   csj
 * Date:     2019/7/8 16:54
 * Description:
 */
package day17;

import java.util.HashMap;
import java.util.Map;

public class Maptest {
    public static void main(String[] args) {

        /*
         * 一个字符串想要知道每个字母出现的次数。
         * 当需求中有对应关系时，先考虑map集合
         * 什么时候使用map集合？
         * 在分析需求中，出现了映射关系，就要先想到具备对应关系的容器。
         * 比如数组，list，map。
         * 如果对应关系的一方是有序的数字，可以考虑数组和list，元素固定考虑数组，不固定考虑list。
         * 如果对应关系的一方没有有序的数字，就要想到map。
         *
         * 通常这些对应关系的容器都可以用于查表法。
         */
    }

    /**
     * 通过中文获取英文.
     * 返回的是cnweek参数对应的英文表示方式。
     * 如果没有对应返回null。
     */
    public static String getEnEwwk(String cnweek) {
        Map<String, String> weekMap = new HashMap<String, String>();

        weekMap.put("星期一", "Monday");
        weekMap.put("星期二", "Tuesday");
        weekMap.put("星期三", "Wednesday");
        weekMap.put("星期四", "Thursday");
        weekMap.put("星期五", "Friday");
        weekMap.put("星期六", "Saturday");
        weekMap.put("星期日", "Sunday");

        return weekMap.get(cnweek);

    }
}
