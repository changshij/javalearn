package day02;

/**
 * @author csj
 * @version v1.0
 * @date 2019/5/14 15:44
 */
public class DemoVar1 {
    public static void main(String[] args) {
        byte b = 4;
        b = 5 + 2;
        byte b1 = 5, b2 = 2;
       //b = b1 + b2; 有变量相加，有可能超出范围
        System.out.println("b = " + b);

        //取模
        int i = 2%5;
        int ii = 5%2;
        System.out.println("2%5 = " + i);
        System.out.println("5%2 = " + ii);
        System.out.println("5/2 = " + 5/2);
        System.out.println("2/5 = " + 2/5);

        int a = 3,c;
        c = a++;
        System.out.println("a = " + a + ";c = " + c);
        a += 2; //a = a + 2; 将两边相加赋给左边；
        System.out.println("a = " + a);

        short s = 4;
//        s = s + 5;Error:(31, 15) java: 不兼容的类型: 从int转换到short可能会有损失
        s += 5;//赋值运算，一次运算，具备自动转换
        System.out.println("s = " + s);
        System.out.println(4 == 3);

        //逻辑运算符是用于连接Boolean型表达式的。
        int x = 4;
        System.out.println(x > 3 & x < 6);
        /*
        * 与： &
        * true & true = true;
        * true & false = false;
        * false & true = false;
        * false & false = false;
        *
        * 或： |
        * true | true = true;
        * true | false = true;
        * false | true = true;
        * false | false = false;
        *
        * 异或：^
        * true ^ false = true;
        * false ^ true = true;
        * false ^ false = false;
        * true ^ true = false;
        *
        * |和||的区别：
        * |：无论左边结果是什么，两边都参与运算；
        * ||：当左边为true时；右边不参与运算；
        * &和&&区别：
        * &：无论左边结果是什么，两边都参与运算；
        * &&：当左边为false时，右边不参与运算；
        */

        /*
        * 左移：<<  实现2的次幂运算，x<<y = x*2(y)；原低位补0
        * 右移：>>  快速运算除以2的次幂，x>>y = x / 2(y)，原高位是什么就补什么
        * 无符号右移：>>> 无论高位是什么都补0；
        * 与运算：&    6&3=2    二进制码进行运算，用于取出二进制中的某一段
        * 或运算：|    6|3=7
        * 异或运算：^  6^3=5
        * 反码：~      ~6=-7
         */
        System.out.println("与运算：6&3 = " + (6&3));
    }
}
