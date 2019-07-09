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
        �ַ����Ĺ���
        1���ַ�����.int �޲��� int length();
        2������һ���ַ����ֵ�λ�á�
        3������λ�û�ȡ��Ӧ�ַ�
         */

        String s1 = "������,csj";
        System.out.println(s1.length());//7
        System.out.println(s1.indexOf('c'));//4:c��һ�γ��ֵ�����λ��
        System.out.println(s1.charAt(2));//��:���� ָ�����������ַ�
        System.out.println(s1.toUpperCase());//������,CSJ:ת���ɴ�д
        System.out.println(s1.replace('c', 'n'));//������,nsj:��ԭ�ַ���c����n����һ���´����
        System.out.println(s1.endsWith("cs")); //�Ƿ���cs����
        System.out.println(s1.contains("cs")); //�Ƿ����cs
        System.out.println(s1.compareTo("changsj"));//���ֵ�˳��Ƚ������ַ���,����������
        System.out.println(s1.substring(2,3));//��:��ȡ2-3���ַ���

        char[] ch = s1.toCharArray();
        for(int i = 0; i < ch.length; i ++)
            System.out.println("ch[" + i + "] = " + ch[i] + " = " +(int)ch[i]);
        System.out.println(s1.toCharArray());//���ַ���ת����char[]����


        System.out.println(getSubstringCount("csjcaasssjcsdddjcsj","cs"));
        System.out.println(myTrim("   cs j  "));
        System.out.println("   cs j  ".trim());//java�ṩ��ȥ�ո񷽷�
        System.out.println(sortString(s1));//,cjs�����������ַ�������
        System.out.println(reverseString(s1));//jsc,�����������ַ�������



        System.out.println(
        getMaxSubString("alfhalhfalsfhsal;f", "akfhakhdakhalh"));
    }


    /*
    ��ȡһ���ַ�����ָ���ִ����ֵĴ�����
    1��ͨ�����������ҵ�һ�ξͼ�¼һ�Σ���ȡ���մ���
    2����ô���ң�indexOf�������÷���ֻ�ܻ�ȡ��һ�γ��ֵ�λ�ã�
        ����ͨ���ı������ʼ���λ���������һ�β���
    3����ΪҪ���ϼ�������Ҫʹ��ѭ��
    */

    public static int getSubstringCount(String str, String substr) {
        //1������һ���������ڼ���
        int count = 0;
        //2�����������¼ÿ�β��ҵ���ʼλ��
        int index = 0;
        //3����Ϊ���Ҷ����ظ���ʹ��ѭ�������ͨ��indexOf����ȷ��������Ϊ-1�Ƴ�ѭ��
        while ((index = str.indexOf(substr, index)) != -1) {
            //ͨ�����ҵ���λ�ã���ȷ����һ�β��ҵ���ʼλ��
            index = index + substr.length();
            //����������
            count++;
        }
        return count;
    }

    /*
    ȥ���ַ������˿ո�
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
    ���ַ�������
     */
    public static String sortString(String str) {
        //1�����ַ���ת��������
        char[] chs = str.toCharArray();
        //2������������
        sortCharArray(chs);
        //3��������������װ�����ַ���
        String temp = new String(chs);

        return temp;
    }

    //���ַ���������
    private static void sortCharArray(char[] chs) {
        //ʹ����Arrays���е����򷽷�
        Arrays.sort(chs);
    }

    //��һ���ַ�����ת
    public static String reverseString(String str) {
        //ת��������
        char[] chs = str.toCharArray();
        //�����鷴ת
        reveres(chs);
        //������ת���ַ���
        String temp = new String(chs);
        return temp;

    }

    //��ת����
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
    ��ȡ�����ַ����������ͬ�Ӵ�
    �Զ̴�Ϊ���ա�
    �ɳ���������ȡ�̴��е��Ӵ���������ȡ���Ӵ�ȥ�����ж��Ƿ���ڣ�
    ������ھ��ҵ���
     */
    public static String getMaxSubString(String str1, String str2) {
        String str = new String();

        for(int x = 0; x < str2.length(); x++) {
            for(int y = 0, z = str2.length() - x; z != str2.length() + 1; y++, z++) {
                //����y,z�Ǳ��ȡstr2�ĳ������εݼ����Ӵ�
                str = str2.substring(y, z);
//                System.out.println(str);
                if(str1.contains(str))
                    return str;
            }
        }

        return str;
    }
}
