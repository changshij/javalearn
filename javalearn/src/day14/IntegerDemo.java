package day14;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/15 9:37
 */
public class IntegerDemo {
    public static void main(String[] args) {
        /*
        �����������Ͷ���İ�װ��
        byte    Byte
        short   Short
        int     Integer
        float   Float
        double  Double
        boolean Boolean
        char    Character

        �ö���ĳ��ó�����
        �ڻ�������ֵ���ַ���֮���ת����

        ��������ֵ--->�ַ�����43+"" = "43";String.valueOf(������������ֵ)
                              static �ַ���toString(��������ֵ)
        �ַ���------->������������ֵ:static ������������parseXXX(�ַ���);
         */


        System.out.println("123" + 1);//1231
        System.out.println(Integer.parseInt("123") + 1);//124
        System.out.println("���ֵ��" + Integer.MAX_VALUE + "\t��Сֵ��" + Integer.MIN_VALUE);//124

        Integer x = new Integer(123);
        Integer y = new Integer("123");
        System.out.println(x==y);//false
        System.out.println(x.equals(y));//true:Integer������equals�������������Լ��ж���ͬ���ݣ�ֻҪ�����е���ֵ��ͬ���ɡ�

        //����ת��
        //ʮ����ת����������
        System.out.println(Integer.toBinaryString(4));//100:ת���ɶ�����
        System.out.println(Integer.toHexString(26));//1a:ת��16����
        System.out.println(Integer.toOctalString(72));//110:ת��8����

        //��������-->ʮ����
        System.out.println(Integer.parseInt("110", 2));//6:������תʮ����
        System.out.println(Integer.parseInt("110", 8));//72:�˽���תʮ����
        System.out.println(Integer.parseInt("1a", 16));//26:ʮ������תʮ����

        //������������ֵת���ɶ���
        Integer i = new Integer(23);
        Integer ii = Integer.valueOf(23);
        //����ת���ɻ�����������ֵ
        int num = i.intValue();

    }
}
