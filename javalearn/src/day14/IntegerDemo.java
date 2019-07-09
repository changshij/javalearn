package day14;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/15 9:37
 */
public class IntegerDemo {
    public static void main(String[] args) {
        /*
        基本数据类型对象的包装类
        byte    Byte
        short   Short
        int     Integer
        float   Float
        double  Double
        boolean Boolean
        char    Character

        该对象的常用场景：
        在基本数据值和字符串之间的转换。

        基本类型值--->字符串：43+"" = "43";String.valueOf(基本数据类型值)
                              static 字符串toString(基本类型值)
        字符串------->基本数据类型值:static 基本数据类型parseXXX(字符串);
         */


        System.out.println("123" + 1);//1231
        System.out.println(Integer.parseInt("123") + 1);//124
        System.out.println("最大值：" + Integer.MAX_VALUE + "\t最小值：" + Integer.MIN_VALUE);//124

        Integer x = new Integer(123);
        Integer y = new Integer("123");
        System.out.println(x==y);//false
        System.out.println(x.equals(y));//true:Integer覆盖了equals方法。建立了自己判断相同依据，只要对象中的数值相同即可。

        //进制转换
        //十进制转换其他进制
        System.out.println(Integer.toBinaryString(4));//100:转换成二进制
        System.out.println(Integer.toHexString(26));//1a:转成16进制
        System.out.println(Integer.toOctalString(72));//110:转成8进制

        //其他进制-->十进制
        System.out.println(Integer.parseInt("110", 2));//6:二进制转十进制
        System.out.println(Integer.parseInt("110", 8));//72:八进制转十进制
        System.out.println(Integer.parseInt("1a", 16));//26:十六进制转十进制

        //基本数据类型值转换成对象
        Integer i = new Integer(23);
        Integer ii = Integer.valueOf(23);
        //对象转换成基本数据类型值
        int num = i.intValue();

    }
}
