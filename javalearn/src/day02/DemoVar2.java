package day02;

public class DemoVar2 {
    public static void main(String[] args) {
        //一个数据与另一个数据异或两次，结果还是该数据
        int a = 5;
        int b = a^4;
        System.out.println("a = " + a + "; b = " + b +"; b^4 = " + (b^4));
        /* 2*8 最有效率的方法算出
        * 2<<3
        */
        System.out.println(2<<3);
        /*
        * 对两个整数变量的值进行互换(不需要第三方变量)
        */
        int x = 3, y = 5;
        System.out.println("x = " + x + "; y = " + y);
        x += y; //x = x + y = 3 + 5;
        y = x - y; //y = x - y = (3 + 5) -5;
        x -=y; //x = x - y = (3 + 5) - 3;
        System.out.println("x = " + x + "; y = " + y);
        x = x ^ y; //x = 5 ^ 3
        y = x ^ y; //y = (5 ^ 3) ^3 = 5
        x = x ^ y; //x = (5 ^ 3) ^5 = 3
        System.out.println("x = " + x + "; y = " + y);
        /*
        * 三元运算符
        * （条件表达式）？表达式1：表达式2；
        * 如果表达式为true,则结果为表达式1；
        * 如果表达式为false,则结果为表达式2；
         */
        x = 2;
        y = x>1? 100:50;
        System.out.println("y = " + y);
        System.out.println((5>6)?5:6);


    }
}
