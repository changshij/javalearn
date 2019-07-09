package day15;

/**
 * @author csj
 * @version v1.0
 * @date 2019/6/18 13:31
 */
/*
Set集合：元素不可以重复。不保证顺序。
         Set中的方法和collection中一致。

         Set：
           |--HashSet:哈希表结构。不同步。查询速度快。
           |--TreeSet:它可以对Set集合中的元素进行排序。数据结构是二叉树结构
                       TreeSet排序有两种方式：
                       1，让元素自身具备比较性。让元素对象实现Comparable接口，覆盖CpmpareTo方法。
                       2，让容器具备比较性。其实就是定义一个比较器，就是实现comparator接口
                          覆盖compare方法。

List集合判断元素是否相同使用的是equals方法；
HashSet集合判断元素是否相同，依据hashCode和equals方法
TestSet集合判断元素是否相同，依据compareTo或者compare方法的return 0.

集合名称规律：
前缀名：数据结构名
后缀名：所属集合的名字
ArrayList:数组结构，所属于List。想到索引，查询快。
LinkedList:链表结构，所属于List。想到增删快。
HashSet:哈希表结构，所属于Set，想到唯一性，查询速度快。
TreeSet:二叉树结构，所属于Set，想到唯一性，而且排序，
        排序两种，自然排序Comaprable，compareTo;比较器排序comparator,compare.



哈希表是提高了查询效率。
判断元素石佛营相同依赖于两个方法。
hashCode()    equals()
 */
public class SetDemo1 {
    public static void main(String[] args) {

    }
}
