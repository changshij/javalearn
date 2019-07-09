package day16;

import day14.Person;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 10:58
 */
public class GenericDemo2 {
    public static void main(String[] args) {
        Person p = new Person();
        Tool tool = new Tool();
        tool.setObject(p);
        Person pp = (Person)tool.getObject();
        pp.getName();


        Util<Person> u = new Util<Person>();
        u.setT(p);
//        u.setT("asd");//Error:(21, 16) java: 不兼容的类型: java.lang.String无法转换为day14.Person
        Person ppp = u.getT();//没有强制转换的麻烦


    }
}

//该工具类只能操作Person
//有了泛型以后，这个类就可以重新设计了
class Util<T> {//泛型类,较之前避免了强制转换麻烦，还提高了安全性。
    private T t;
    public void setT(T t) {
        this.t = t;
    }
    public T getT() {
        return t;
    }
}
//可不可以定义一个操作所有对象的工具类呢？可以，可以使用Object
class Tool {
    private Object obj;
    public void setObject(Object obj) {
        this.obj = obj;
    }
    public Object getObject() {
        return obj;
    }
}
/*class Tool {
    private Person p;
    public void setPerson(Person p) {
        this.p = p;
    }
    public Person getPerson() {
        return p;
    }
}*/