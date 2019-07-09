package day04;

/**
 * @author: csj
 * @DATE: 2019/5/16 0016 下午 7:32
 * @version: v1.0
 */
public class doubleArrayDemo {
    public static void main(String[] args) {
        int[][] arr = new int[4][3];//二维数组中有4个一维数组，每个一维数组中有3个元素
        System.out.println(arr.length);
        System.out.println(arr[0][1]);//0
        System.out.println(arr[0]);//[I@4554617c:@左边数据类型，@右边哈希值
        System.out.println(arr);//[[I@74a14482:@左边数据类型，@右边哈希值

        int[][] arr2 = new int[3][];
        System.out.println(arr[0]);//null
        //分别对二维数组中的每一个小数组初始化
        arr2[0] = new int[3];
        arr2[1] = new int[2];
        arr2[2] = new int[1];
        /*

         */

    }
    /* 二维数组 */
}
