package day16;

import day14.Person;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/19 17:16
 */
public class Worker extends Person {
    public Worker() {
    }

    public Worker(String name, int age) {
        super(name, age);
    }

    @Override
    public String toString() {
        return "Worker [name=" + getName() + ", age=" + getAge() + "]";
    }
}
