package day16;

import day14.Person;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 17:09
 */
public class Student extends Person {
    public Student() {
        super();
    }
    public Student(String name, int age) {
        super(name,age);
    }

    @Override
    public String toString() {
        return "Student [name=" + getName() + ", age=" + getAge() + "]";
    }
}
