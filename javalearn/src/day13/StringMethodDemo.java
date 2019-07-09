package day13;

import java.util.Arrays;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/13 16:56
 */
public class StringMethodDemo {
    public static void main(String[] args) {

        /*
        字符串的功能
        1，字符个数.int 无参数 int length();
        2，查找一个字符出现的位置。
        3，根据位置获取对应字符
         */

        String s1 = "常世君,csj";
        System.out.println(s1.length());//7
        System.out.println(s1.indexOf('c'));//4:c第一次出现的索引位置
        System.out.println(s1.charAt(2));//君:返回 指定索引处的字符
        System.out.println(s1.toUpperCase());//常世君,CSJ:转换成大写
        System.out.println(s1.replace('c', 'n'));//常世君,nsj:将原字符串c换成n返回一个新串输出
        System.out.println(s1.endsWith("cs")); //是否以cs结束
        System.out.println(s1.contains("cs")); //是否包含cs
        System.out.println(s1.compareTo("changsj"));//按字典顺序比较两个字符串,返回正负零
        System.out.println(s1.substring(2,3));//君:截取2-3间字符串

        char[] ch = s1.toCharArray();
        for(int i = 0; i < ch.length; i ++)
            System.out.println("ch[" + i + "] = " + ch[i] + " = " +(int)ch[i]);
        System.out.println(s1.toCharArray());//将字符串转换成char[]数组


        System.out.println(getSubstringCount("csjcaasssjcsdddjcsj","cs"));
        System.out.println(myTrim("   cs j  "));
        System.out.println("   cs j  ".trim());//java提供的去空格方法
        System.out.println(sortString(s1));//,cjs世君常：对字符串排序
        System.out.println(reverseString(s1));//jsc,君世常：对字符串排序



        System.out.println(
        getMaxSubString("alfhalhfalsfhsal;f", "akfhakhdakhalh"));
    }


    /*
    获取一个字符串中指定字串出现的次数：
    1，通过计数器，找到一次就记录一次，获取最终次数
    2，怎么查找？indexOf方法，该方法只能获取第一次出现的位置，
        可以通过改变查找起始点的位置来完成下一次查找
    3，因为要不断计数，需要使用循环
    */

    public static int getSubstringCount(String str, String substr) {
        //1，定义一个变量用于计数
        int count = 0;
        //2，定义变量记录每次查找的起始位置
        int index = 0;
        //3，因为查找动作重复，使用循环解决再通过indexOf方法确定条件，为-1推出循环
        while ((index = str.indexOf(substr, index)) != -1) {
            //通过查找到的位置，来确定下一次查找的起始位置
            index = index + substr.length();
            //计数器计数
            count++;
        }
        return count;
    }

    /*
    去除字符串两端空格
     */
    public static String myTrim(String str) {
        int start = 0;
        int end = str.length() - 1;
        while(str.charAt(start) == ' ' && start <= end)
            start ++;
        while ((str.charAt(end)  == ' ' && end >= start))
            end --;

        return str.substring(start, (end + 1));
    }

    /*
    对字符串排序
     */
    public static String sortString(String str) {
        //1，将字符串转换成数组
        char[] chs = str.toCharArray();
        //2，对数组排序
        sortCharArray(chs);
        //3，将排序后的数组装换成字符串
        String temp = new String(chs);

        return temp;
    }

    //对字符数组排序
    private static void sortCharArray(char[] chs) {
        //使用了Arrays类中的排序方法
        Arrays.sort(chs);
    }

    //将一个字符串反转
    public static String reverseString(String str) {
        //转换成数组
        char[] chs = str.toCharArray();
        //对数组反转
        reveres(chs);
        //将数组转成字符串
        String temp = new String(chs);
        return temp;

    }

    //反转数组
    private static void reveres(char[] chs) {
        for(int start = 0, end = chs.length - 1; start < end; start++,end--) {
            swap(chs, start, end);
        }
    }

    private static void swap(char[] chs, int start, int end) {
        char temp = chs[start];
        chs[start] = chs[end];
        chs[end] = temp;
    }

    /*
    获取两个字符串中最大相同子串
    以短串为参照。
    由长到短来获取短串中的子串，并将获取的子串去大串中判断是否存在，
    如果存在就找到。
     */
    public static String getMaxSubString(String str1, String str2) {
        String str = new String();

        for(int x = 0; x < str2.length(); x++) {
            for(int y = 0, z = str2.length() - x; z != str2.length() + 1; y++, z++) {
                //根据y,z角标获取str2的长度依次递减的子串
                str = str2.substring(y, z);
//                System.out.println(str);
                if(str1.contains(str))
                    return str;
            }
        }

        return str;
    }
}
