package day16;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 10:18
 */
/*
泛型：
1，JDK1.5版本出现的新特性；
2，泛型将运行时期的问题转移到了编译时期；
3，避免了强制转换的麻烦；
4，泛型技术是用于编译时期的技术；
泛型的体现：
<> 这就是用于定义类型参数的符号；
泛型可以简单的理解为，接收具体的元素类型。

对源码进行编译时，通过泛型进行类型的检查，
如果类型没有问题，则将源码编译成class文件。
注意class文件中是不带有泛型信息的，这种情况称之为泛型擦除。

 */
public class GenericDemo1 {
    public static void main(String[] args) {
//        HashSet<String>

//        String[] arr = new String[3];//先明确类型
//        arr[0] = new Integer(35);//存储时，如果类型不匹配，就编译报错
//Error:(15, 18) java: 不兼容的类型: java.lang.Integer无法转换为java.lang.String

//        ArrayList al = new ArrayList();
        ArrayList<String> al = new ArrayList<String>();

        al.add("asd"); //add(Object obj)
//        al.add(5);     //自动装箱，一旦指定了具体元素的类型，存储时不匹配，就编译报错。
        //加<>后编译报错：Error:(22, 11) java: 对于add(int), 找不到合适的方法


        for(Iterator<String> it = al.iterator(); it.hasNext();) {
//            Object obj = it.next();
//            String s = (String) obj;//ClassCastException:Integer不能转换成String类型
//            System.out.println(s.length());

            String s = it.next();
            System.out.println(s.length());

        }
    }
}
