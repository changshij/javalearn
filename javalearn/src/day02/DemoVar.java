package day02;

public class DemoVar {
    public static void main(String[] args) {
        //数据类型 变量名 = 初始化
        byte b = 127;
        int x = 5;
        x = x + b;
        b = (byte)(b + 4);
        System.out.println(b);
        System.out.println("x = " + x);

        char c = 'a';
        System.out.println("c = " + c);
        System.out.println("c + 1 = " + (c + 1));
        System.out.println("c + 1 = " + (char)(c + 1));

        //字符串和任何字符做+运算，都是连接，最终运算结果还是一个字符串
        String str = "asd";
        System.out.println("str = " + (str + 1));


    }
}
