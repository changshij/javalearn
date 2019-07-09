package day03;

/**
 * @author csj
 * @version v1.0
 * @date 2019/5/15 16:10
 */
public class ShuZuDemo {
    public static void main(String[] args) {
        /* 元素类型[] 数组名 = new 元素类型[元素个数或者数组长度] */
        int[] arr = new int[3];

        /*
        五片区域：
        寄存器，栈内存，堆内存，方法区，本地方法区
        寄存器：CPU使用
        栈内存：存储的都是局部变量，一旦使用完，立刻被释放。压栈，弹栈；先进后出
        堆内存：存储的是实体（对象）。（用new开辟的都在堆里面）
        1，堆内存中的每一个实体都有自己的内存地址值。
        2，堆内存中每一个变量都有默认初始化值，不同类型初始化值不同。
        3，当实体被视为垃圾时，会在不定时的时间内，会被当做垃圾回收，
         */
        boolean[] arr2 = new boolean[3];
        System.out.println(arr2[1]); //false

//        int[] arr3 = new int[]{12,18,33,66};
        /* 即明确了元素个数，又明确了元素的内容 */
        int[] arr3 = {12,18,33,66,77,88,99};
        System.out.println(arr3.length);//获取数组元素个数

        /* 数组操作常见问题 */
        int[] arr4 = new int[3];
//        System.out.println(arr4[2]);//ArrayIndexOutOfBoundsException
        //当访问不存在的角标时，就会发生该异常。
        arr4 = null;
//        System.out.println(arr4[1]);//NullPointerException 空指针异常
        //当引用没有任何实体指向时，还在使用其操作实体，就会发生该异常

        /* 数组的常见操作：
         * 1,获取元素，遍历 */
        for(int i = 0; i < arr3.length; i ++)
            System.out.println("arr3[" + i + "] = " + arr3[i] + ";");

        /* 2,获取最值 */
        /*int max = 0;
        for(int i = 0; i < arr3.length; i ++) {

            max = Max(max, arr3[i]);
        }*/
        int max = getMax(arr3);
        System.out.println("arr3[] max one = " + max);

    }
    public static int Max(int a, int b) {
        return a>b?a:b;
    }
    public static int getMax(int[] arr) {
        int max = arr[0];//初始化为任意一个元素
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i])
                max = arr[i];
        }
        return max;
    }
    public static int getMax2(int[] arr) {
        int max = 0;//初始化任意一个角标
        for(int i = 0; i < arr.length; i++) {
            if(arr[max] < arr[i])
                max = i;
        }
        return arr[max];
    }
}
