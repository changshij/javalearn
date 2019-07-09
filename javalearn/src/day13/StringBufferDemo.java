package day13;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/14 15:01
 */
/*
StringBuffer��һ��������
 */
public class StringBufferDemo {
    public static void main(String[] args) {

        /*
        StringBuffer���ַ���������
        1�����Դ洢�����������ݡ�
        2�����Ȳ��̶���
        3�����۴洢ʲô���͵�Ԫ�أ����ն������ַ�����
        �����������ܣ�
        1�����     ����
           append   insert
        2��ɾ�� delete
        3���滻

         JDK1.5�汾������StringBuilder.
         StringBuffer���̰߳�ȫ�ġ�
         StringBuilder���̲߳���ȫ�ġ�


         */

        //����һ���ַ�������������
        StringBuffer buffer = new StringBuffer();
        //���Ԫ��
        buffer.append("abc  ");
        buffer.append("abc  ").append(true);
        buffer.append(new Object());

        buffer.insert(1, "insert");
        System.out.println(buffer.toString());
        buffer.delete(1,2);//ɾ��һ�Σ�����ͷ����β
        buffer.deleteCharAt(1);//ɾ���̶��Ǳ���ַ�
        System.out.println(buffer.toString());
        buffer.replace(1,4,"ak47");//�滻
        System.out.println(buffer.toString());
        buffer.reverse();//��ת
        System.out.println(buffer.toString());
        buffer.setCharAt(0,'b');//�滻
        System.out.println(buffer.toString());
        System.out.println(buffer.length());//

        buffer.setLength(10);//���ó���
        System.out.println(buffer.toString());
        System.out.println(buffer.length());//
        buffer.setLength(15);//���ó���
        System.out.println(buffer.toString());
        System.out.println(buffer.length());//

    }
}
