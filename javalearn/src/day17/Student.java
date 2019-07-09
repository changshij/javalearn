/**
 * FileName: Student
 * Author:   csj
 * Date:     2019/7/8 14:33
 * Description:
 */
package day17;

public class Student implements Comparable<Student>{
    private String name;
    private int age;

    public Student() {
        super();
    }

    public Student(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    /*
    ** 覆盖hashCode方法
     */

    @Override
    public int hashCode() {
        final int NUMBER = 32;//对32这个数字进行命名定义，增强阅读性。
        return name.hashCode() + age * NUMBER;
    }


    /*
     ** 覆盖equals方法
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student))
            throw new ClassCastException("错误的类型");
        Student stu = (Student) obj;
        return this.name.equals(stu.name) && this.age == stu.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    @Override
    public int compareTo(Student o) {
        int temp = this.age - o.age;
        return temp == 0 ? this.name.compareTo(o.name) : temp;
    }
}
