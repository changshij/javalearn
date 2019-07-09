package day04;

/**
 * @author: csj
 * @DATE: 2019/5/16 0016 下午 7:54
 * @version: v1.0
 */
public class Array2Demo {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,6,9,5},{21,22,25,90,11}};
        System.out.println(arr.length);//3
        System.out.println(arr[0].length);//3
        System.out.println(arr[2].length);//5
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr[i].length; j++)
                sum = sum + arr[i][j];
        }
        System.out.println("sum = " + sum);

        /* break:作用于switch语句和循环语句。
        1，跳出当前循环
         */
        for(int i=0; i<3; i++) {
            for(int j=0; j<5; j++) {
                System.out.println("i = " + i);
                break;//跳出当前循环
            }
        }
        //使用标记符号
        wai: for(int i=0; i<3; i++) {
            nei: for(int j=0; j<5; j++) {
                System.out.println("i = " + i);
                break wai;//跳出循环
            }
        }
        //countion:只能使用在循环语句中，继续循环。

    }
}
