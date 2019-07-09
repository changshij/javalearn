package day04;

import java.util.Arrays;

/**
 * @author csj
 * @version v1.0
 * @date 2019/5/16 14:29
 */
public class OrderDemo {
    public static void main(String[] args) {

        int[] arr = {55,36,77,28,19};
        System.out.println("排序后： " + arrayToString(arr));
        Arrays.sort(arr);//java提供的已有的排序方法
        System.out.println("排序后： " + arrayToString(arr));

    }
    /* 排序：n为元素个数 */
    /* 选择排序：1，0角标和后面元素比较，共比较n-1次
     * 2，1角标和后面元素比较，共比较n-2次
     * 最小的先到最前面*/
    public static void selectSort(int[] arr) {
        //定义循环，确定参与比较的元素
        for(int x = 0; x < arr.length - 1; x++) {
            for(int y = x +1; y < arr.length; y++ )
                //判断前一个大于后一个，进行位置置换
                if(arr[x] > arr[y]) {
                    swap(arr, x, y);
                }
        }
    }

    /* 冒泡排序：每次相邻两个对比：
    * 1，0-1，1-2，2-3
    * 2，0-1，1-2
    * 3，0-1
    * 最大的先到最后面*/
    public static void selectSort2(int[] arr) {
        //定义循环，确定参与比较的元素
        for(int x = 0; x < arr.length - 1; x++) {
            //-1为了防止角标越界，-x随着比较轮数增加，让相邻比较的元素减少
            for(int y = 0; y < arr.length - 1 - x; y++ )
                //判断前一个大于后一个，进行位置置换
                if(arr[y] > arr[y + 1]) {
                    swap(arr, y, y + 1);
                }
        }
    }

    /* 对于一个数组两个元素进行位置置换 */
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }



    /* 数组转换成字符串 */
    public static String arrayToString(int[] arr) {
        String temp = new String();
        for(int i = 0; i < arr.length; i ++) {
            if(i == arr.length - 1)
                temp = temp + arr[i];
            else
                temp = temp + arr[i] + ",";
        }
        return temp;
    }
}
