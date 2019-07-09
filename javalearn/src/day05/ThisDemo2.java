package day05;

/**
 * @author: csj
 * @DATE: 2019/5/20 0020 下午 8:19
 * @version: v1.0
 */
/* this 使用之二：使用this(参数列表)的方式可以实现构造函数之间的调用
 * 注意：构造函数之间调用时，this语句只能定义在构造函数的第一行
  * */
class Person {
    private String name;
    private int age;
    Person(){}
    Person(String name) {
        this.name = name;
    }
    Person(String name, int age) {
//        this.name = name;
        this(name);//构造函数之间调用，必须是第一行
        this.age = age;
    }
    void speak() {
        System.out.println("name = " + this.name + "; age = " + this.age);
    }
    Person(int age) {
        this.age = age;
    }
    /* 定义一个功能，用于比较两个人是否同龄
     * 明确1，结果：boolean
     * 明确2，参数：一个，Person
     */
    public boolean comper(Person p) {
        if(this.age == p.age)
            return true;
        else
            return false;
    }
}
public class ThisDemo2 {
    public static void main(String[] args) {
        Person p = new Person("李宁", 28);
        p.speak();
        Person p1 = new Person(18);
        Person p2 = new Person(20);
        System.out.println("p1和p2的年龄是否相等？" + p1.comper(p2));

    }
}
