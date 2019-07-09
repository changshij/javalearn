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
    ** ����hashCode����
     */

    @Override
    public int hashCode() {
        final int NUMBER = 32;//��32������ֽ����������壬��ǿ�Ķ��ԡ�
        return name.hashCode() + age * NUMBER;
    }


    /*
     ** ����equals����
     */
    @Override
    public boolean equals(Object obj) {
        if(!(obj instanceof Student))
            throw new ClassCastException("���������");
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
