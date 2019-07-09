package day14;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/15 11:26
 */
public class IntegerDemo2 {
    public static void main(String[] args) {
        /*
        JDK1.5以后，基本数据类型对象包装类有了一个新特性。
        自动装箱拆箱。
         */

//        Integer i = new Integer(34);
        //jdk1.5以后，简化成：
        Integer i = 34;//等同于：Integer i = Integer.valueOf(34);//自动装箱

        i = i + 2;//i+2,i先转成一个整数，i.valueOf()自动拆箱
        //i = Integer.valueOf(i.intValue() + 2)
        System.out.println("i = " + i);


        Integer x = new Integer(123);
        Integer y = new Integer(123);
        System.out.println(x==y);//false
        System.out.println(x.equals(y));//true
        Integer xx = 123;
        Integer yy = 123;
        System.out.println(xx==yy);//true,128false
        System.out.println(xx.equals(yy));//true
        /*内存优化：
        在byte的范围内，如果已经存在，不再进行开辟新的内存空间
         */

    }
}
