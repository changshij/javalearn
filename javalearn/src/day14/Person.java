package day14;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/17 14:55
 */
public class Person implements Comparable{
    private String name;
    private int age;
    public Person() {
        super();
    }
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }


    /* add for day15.HashSetDemo.java begin */
    //建立Person对象自己的哈希算法
    //根据对象自身的特点建立哈希算法/*
    public int hashCode() {
        return name.hashCode() + age;
    }
    //判断Person对象内容相同的已经
    public boolean equals(Object obj) {
        if(!(obj instanceof Person))//Obj不是Person类型对象
            throw new ClassCastException("类型错误");
        Person p = (Person)obj;
        return (this.name.equals(p.name)) && (this.name == p.name);
    }
    /* add for day15.HashSetDemo.java end */


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
        return "Preson{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }


    /* add for day15.TreeSetDemo.java begin */
    //为了让Person具有自然排序功能，必须可以进行比较
    //该功能已经定义在Comparable接口，只有实现Comparable接口即可，覆盖CompereTo
    @Override
    public int compareTo(Object o) {
        //通过年龄比较，如果年龄相同，再比较次要条件
        if(!(o instanceof Person))
            throw new ClassCastException("类型错误");
        Person p = (Person)o;
        /*if(this.age > p.age)
            return 1;
        else if(this.age < p.age)
            return -1;
        else
            return 0;*/
//            return 0;
//            return 1;//实现存入和取出顺序一致
//            return -1;
        int temp = this.age - p.age;
        return temp == 0 ? this.name.compareTo(p.name) : temp;
    }
    /* add for day15.TreeSetDemo.java end */

}
