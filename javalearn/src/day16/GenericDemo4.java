package day16;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 16:27
 */
public class GenericDemo4 {
    public static void main(String[] args) {

        Demo d = new Demo();
        d.show("hah");

        Demo2<String> d2 = new Demo2<String>();
        d2.show("ahah");
    }
}

/*
泛型接口。
 */
interface Inter<U> {
    public void show(U u);
}
class Demo2<T> implements Inter<T> {
    @Override
    public void show(T t) {

    }
}
class Demo implements Inter<String> {
    public void show(Integer i) {

    }

    @Override
    public void show(String s) {

    }
}
