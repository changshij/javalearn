package day13;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/13 16:26
 */
public class StringDemo1 {
    public static void main(String[] args) {

        /*
        字符串String
        1，字符串是常量，一旦初始化，就不可以被改变。
         */

        String str = "abc";
        String s = str;
        System.out.println("str = " + str + "..." + str.hashCode());
        System.out.println("s = " + s + "..." + s.hashCode());

        String s2 = new String("abc");
        System.out.println("s2 = " + s2 + "..." + s2.hashCode());
        System.out.println(s==str);
        System.out.println(s==s2);

    }
}
