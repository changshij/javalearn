package day03;

/**
 * @author csj
 * @version v1.0
 * @date 2019/5/15 9:42
 * 方法（函数）练习
 * 函数的好处：
 * 1，对细节进行封装；2，提高了代码的复用性。
 */
public class FunctionDemo {
    public static void main(String[] args) {
        int a = Add(5, 6);
        System.out.println("5 + 6 = " + a);
        PrintSum(9,9);
    }

    /*
    * 修饰符 返回值类型 函数名（参数类型 形式参数1，参数类型 形式参数2， ……）
    * {
    *       执行语句；
    *       return 返回值；
    * }
    * return： 将函数的功能结果返回给调用者；
    *          结束函数，是一个结束的标记。
    *          当void类型的函数定义时，函数中的return后面直接分号结束，
    *          同时，该return可省略不写，编译器会帮你加上。
    */
    public static int Add(int a, int b) {
        return a + b;
    }
    /*
    * 函数<->方法的特殊情况：
    * 当一个功能没有具体结果返回时，JAVA中用void来表示返回值类型；
    *
    */
    public static void PrintSum(int x,int y) {
        System.out.println(x + y);
    }
}
