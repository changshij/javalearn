package day17;

import java.util.Properties;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/22 11:05
 */
public class SystemDemo {
    private static final String SEPARATOR = System.getProperty("line.separator");
    public static void main(String[] args) {

        /* System：
        ** 全是静态的成员，不能实例化；
        ** 演示System，获取当前时间。
        * */

        long time = System.currentTimeMillis();
        System.out.println(time);//返回的是与格林威治时间差值

        Properties prop = System.getProperties();//当前系统属性
//        System.out.println(prop);
        //获取系统的属性信息
//        Set<String> keySet = prop.stringPropertyNames();
//        Iterator<String> it = keySet.iterator();
//        while(it.hasNext()) {
//            String key = it.next();
//            String value = prop.getProperty(key);
//            System.out.println(key + ":::" +  value);
//        }

        //通过指定键获取值
//        String osName = System.getProperty("os.name");
//        System.out.println(osName);
        //换行，平台不同，换行符可能不同
        //通过System.getProperty("line.separator")就可以实现在任何操作系统，都可以换行
        //因为System.getProperty("line.separator")是获取与系统平台有关的行分隔符。
        System.out.println("Hello" + System.getProperty("line.separator") + "world");
        System.out.println("Hello" + SEPARATOR + "world");
    }
}
