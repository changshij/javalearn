package day02;

/**
 * @author: csj
 * @DATE: 2019/5/14 0014 下午 10:37
 * @version: v1.0
 */
public class DemoSwitch {
    public static void main(String[] args) {
        /*
        * switch(表达式) 被选择的表达式的数据类型只能是byte,shout,int,char
        * {
        *   case 取值1：
        *       执行语句；
        *       break；
        *   case 取值2：
        *       执行语句；
        *       break；
        *   default：
        *       执行语句；
        *       break；
        *       备选答案没有顺序要求，，但是从第一个case开始执行
        *       只有所有case不匹配，才会执行default。
        *       结束：遇到break，或者执行到大括号
        * }
        * switch语句和if语句很像
        * 当对具体的几个值进行判断的时候，可以使用if，也可以使用switch，建议使用switch,效率高点；
        * if语句可以对区间进行判断，还可以对运算结果是Boolean类型的进行判断；
        *
        */
        int x = 3;
        switch(x) {
            default:
                System.out.println("no");
                break;
            case 4:
                System.out.println("a");
                break;
            case 5:
                System.out.println("b");
                break;
//            default:
//                System.out.println("no");
//                break; //最后面的break是可以省略的
        }
    }
}
