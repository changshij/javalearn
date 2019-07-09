package day16;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 13:48
 */
public class genericDemo3 {
    public static void main(String[] args) {

        Demo3<String> d3 = new Demo3<String>();
        d3.show("abd");
        d3.print("asd");
        Demo3<Integer> d33 = new Demo3<Integer>();
        d33.print(9);
        d33.method("hello");
    }
}
/*
类中操作的对象类型不确定，将泛型定义在类上。
方法中操作的类型不确定，将泛类型定义在方法上。
如果是在静态方法上使用泛型，该泛型必须定义在方法上。
 */
//泛型方法
class Demo3<W> {
    public void show(W w) {
        System.out.println("show : " + w);
    }
    public void print(W w) {
        System.out.println("print : " + w);
    }
    //将泛型定义在方法上
    public <M> void method(M m) {
        System.out.println("method : " + m);
    }

//    public static void function(W w) {//Error:(37, 33) java: 无法从静态上下文中引用非静态 类型变量 W
    public static <K> void function(K k) {
        System.out.println("function : " + k);
    }
}
