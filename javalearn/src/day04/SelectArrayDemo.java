package day04;

import java.util.Arrays;

/**
 * @author csj
 * @version v1.0
 * @date 2019/5/16 15:10
 */
public class SelectArrayDemo {
    public static void main(String[] args) {
        int[] arr = {2, 5, 6, 9, 11, 13};
        System.out.println("11 in arr :" + searchIndex(arr, 11));

        int index = Arrays.binarySearch(arr, 8);//开发中使用的二分查找，Java提供的现有的
        System.out.println("bingarySearch:" + index);//bingarySearch:-4变正后-1是插入点
        int[] arr1 = {1,2,3,4};
        System.out.println(getIndex(arr1, 2));
        System.out.println(getIndex3(arr1, 2));

    }

    /* 数组中元素的查找，获取元素的位置
     * 结果：角标， int
     * 参数：数组， int[]*/
    public static int searchIndex(int[] arr,int key) {
        //1,遍历数组
        for(int x = 0; x < arr.length; x++) {
            if(arr[x] == key)
                return x;
        }
        return -1;
    }
    /* 二分查找法：所查找数组必须是有序的 */
    public static int getIndex(int[] arr, int key) {
        //1，定义三个变量，记录头角标、尾角标、中间角标
        int min, mid, max;
        min = 0;
        max = arr.length - 1;
        mid = (max + min)/2; //(max+min)>>1
        //2，因为不断折半，通过循环完成，只要没有找到就继续循环
        while(arr[mid] != key) {
            //3,判断中间角标和key的大小
            if(key > arr[mid]) {
                min = mid + 1;//小角标改变
            }
            else if(key < arr[mid]) {
                max = mid - 1;//大角标改变
            }
            //3,判断元素不存在的情况，只要小角标大于了大角标，就折半结束，并返回-1，表示不存在情况
            if(min > max)
                return -1;
            //因为max或者min的转变，重新计算mid值
            mid = (max + min) >> 1;
        }
        return mid;
    }
    //折半的另一种写法
    public static int getIndex2(int[] arr, int key) {
        int min, mid, max;
        min = 0;
        max = arr.length -1;
        //先判断大小标之间是否有距离
        while(min <= max) {
            //折半
            mid = (max + min) >> 1;
            if(key > arr[mid])
                min = mid + 1;
            else if(key < arr[mid])
                max = mid -1;
            else
                return mid;
        }
        return -1;
    }

    //给定一个有序的数组，往其中插入一个数据，还必须保证该数组有序，这个插入位置如何找到？
    //折半
    public static int getIndex3(int[] arr, int key) {
        int min, mid, max;
        min = 0;
        max = arr.length -1;
        //先判断大小标之间是否有距离
        while(min <= max) {
            //折半
            mid = (max + min) >> 1;
            if(key > arr[mid])
                min = mid + 1;
            else if(key < arr[mid])
                max = mid -1;
            else
                return mid;
        }
        return min;
    }
}
