package day02;

/**
 * @author: csj
 * @DATE: 2019/5/14 0014 下午 10:57
 * @version: v1.0
 */
public class DemoWhile {
    public static void main(String[] args) {
        /*
        * 循环结构：while, do while, for
        */
        //打印1-10之间的奇数
        int x = 1;
        while(x <= 10) {
            switch(x%2) {
                case 0:
                    break;
                default:
                    System.out.println(x);
            }
//            System.out.println("x = " + x);
            x ++;
        }
        //1-10的和
        x = 1;
        int y = 0;
        do {
//            System.out.println("x = " + x);
            y = y + x;
            x = x + 1;
        }while(x <= 10);
        System.out.println("y = " + y);

        //获取1-100之间6的倍数的个数
        int count = 0;
        for(int i = 1; i <= 100; i++) {
            if(i%6 == 0)
                count++;
        }
        System.out.println("count = " + count);

    }
}
