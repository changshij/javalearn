package day04;

/**
 * @author csj
 * @version v1.0
 * @date 2019/5/16 10:51
 */
public class TestWorkDay03 {
    public static void main(String[] args) {
        System.out.println(GetLevel(91));
        int[] arr = {55,66,77,88,99};
        System.out.println(arrayToString(arr));
        arrayReverse(arr);
        System.out.println(arrayToString(arr));
        swap(arr, 2,3);
        System.out.println(arrayToString(arr));


    }
    /* 定义一个功能，通过成绩获取相应的等级
     * 90-100  A  优秀
     * 80-90  B  良好
     * 70-80  C  中等
     * 60-69  D  及格
     * < 60   E  不及格
     */
    public static String GetLevel(int a) {
        String str;
        if(a >= 90)
            str = "A";
        else if(a >= 80 && a < 90)
            str = "B";
        else if(a >= 70 && a < 80)
            str = "C";
        else if(a >= 60 && a < 70)
            str = "D";
        else
            str = "E";
        return  str;
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
    /* 对一个数组元素进行反转 */
    /* {55,66,77,88}- {88,77,66,55} */
    public static void arrayReverse(int[] arr) {
        int temp = 0;
        for(int start = 0, end = arr.length - 1; start < end; start++, end--) {
            /*temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;*/
            swap(arr, start,end);
        }
    }
    /* 对于一个数组两个元素进行位置置换 */
    public static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
