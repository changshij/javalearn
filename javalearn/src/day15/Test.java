package day15;

import java.util.Arrays;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 10:44
 */
public class Test {
    public static void main(String[] args) {

        String[] arr = {"afdad","fcdsgd","gdgh","grerh","ewgry"};
//        arrayPrint(arr);
        System.out.println(Arrays.toString(arr));
        sortStringArray(arr);
//        arrayPrint(arr);
        System.out.println(Arrays.toString(arr));

    }
    /*
    对{"afdad","fcdsgd","gdgh","grerh","ewgry"}对该字符串数组中的元素进行字典顺序的排序。
    1，对数组排序会；
    2，不过字符串数组有一个问题，和int比起来，咋比较大小？
    3，字符串是对象，不可以用大小于比较，查API，字符串中有一个用于字符串大小的方法
    compareTo，
     */
    public static void sortStringArray(String[] arr) {
        for(int x = 0; x < arr.length; x++) {
            for(int y = x + 1; y < arr.length; y++) {
                if(arr[x].compareTo(arr[y]) > 0)
                    swap(arr, x, y);
                }
            }

        }

    private static void swap(String[] arr, int x, int y) {
        String temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
    }
    public static void arrayPrint(String[] arr) {
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
    }
}
