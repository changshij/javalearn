package day13;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/14 15:01
 */
/*
StringBuffer是一个容器，
 */
public class StringBufferDemo {
    public static void main(String[] args) {

        /*
        StringBuffer：字符串缓冲区
        1，可以存储任意类型数据。
        2，长度不固定。
        3，无论存储什么类型的元素，最终都会变成字符串。
        容器常见功能：
        1，添加     插入
           append   insert
        2，删除 delete
        3，替换

         JDK1.5版本出现了StringBuilder.
         StringBuffer是线程安全的。
         StringBuilder是线程不安全的。


         */

        //创建一个字符串缓冲区对象
        StringBuffer buffer = new StringBuffer();
        //添加元素
        buffer.append("abc  ");
        buffer.append("abc  ").append(true);
        buffer.append(new Object());

        buffer.insert(1, "insert");
        System.out.println(buffer.toString());
        buffer.delete(1,2);//删除一段，包含头不含尾
        buffer.deleteCharAt(1);//删除固定角标的字符
        System.out.println(buffer.toString());
        buffer.replace(1,4,"ak47");//替换
        System.out.println(buffer.toString());
        buffer.reverse();//反转
        System.out.println(buffer.toString());
        buffer.setCharAt(0,'b');//替换
        System.out.println(buffer.toString());
        System.out.println(buffer.length());//

        buffer.setLength(10);//设置长度
        System.out.println(buffer.toString());
        System.out.println(buffer.length());//
        buffer.setLength(15);//设置长度
        System.out.println(buffer.toString());
        System.out.println(buffer.length());//

    }
}
