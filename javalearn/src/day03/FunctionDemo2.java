package day03;

/**
 * @author csj
 * @version v1.0
 * @date 2019/5/15 14:24
 */
public class FunctionDemo2 {
    public static void main(String[] args) {

        PrintJuX(6,4);
        System.out.println(compare(5,6));
        PrintCFB();
        System.out.println(max(9,10));
    }
    /*
     * 定义函数的两个明确：1，明确函数功能；(返回值类型)
     * 2，在定义该功能工程中，是否有未知的内容参数运算。(参数个数以及类型)
     */
    /*
    定义一个画矩形的功能：
    1，没有结果，返回值类型void
    2，有未知参数参与运算，长和宽
     */
    public static void PrintJuX(int x, int y) {
        for(int i = 0; i < y; i++) {
            for(int j = 0; j < x; j++) {
                /*if(i == 0 || i == (y - 1))
                    System.out.print("* ");
                else {
                    if(j == 0 || j ==(x - 1))
                        System.out.print("* ");*/
                if(i == 0 || i == (y - 1) || j == 0 || j ==(x - 1))
                    System.out.print("* ");
                else
                    System.out.print("  ");
//                }
            }
            System.out.println();
        }
    }

    /* 判断两整数是否相等 */
    public static boolean compare(int a, int b) {
//        return a == b ? true : false;
        /* 三元运算符特点：运算完必须有结果 */
        return a == b;
    }
    /* 9*9表 */
    public static void PrintCFB(){
        for(int x=1; x<=9; x++) {
            for(int y=1; y<=x; y++)
                System.out.print(x*y + "\t");
            System.out.println();
        }

    }

    /* 取两个整数中较大的整数 */
    public static int max(int a, int b) {
        return a>b?a:b;
    }

    /* 求和 */
    public static int add(int a, int b) {
        return a+b;
    }
    public static double add(double a, double b) {
        return a+b;
    }

}
