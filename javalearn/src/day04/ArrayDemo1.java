package day04;

/**
 * @author csj
 * @version v1.0
 * @date 2019/5/16 16:38
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        System.out.println(getWeek(3));

    }
    /*
    数组或容器什么时候用？
    当数据多的时候，先将这些数据都存储起来，进行使用
    查表法：其实就是在使用容器。
    当对需求进行分析是，发现需求中存在映射（对应）关系时，可以使用容器。
    数组：映射关系的一方是有序的数字（角标），同时数据的个数必须是固定的。
     */
    //需求：通过用户的输入数字获取相应的星期
    public static String getWeek(int num) {
        if(num <= 0 || num > 7)
            return "没有对应的星期";
        //1,创建一个表。
        String[] weeks = {"星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期日"};
        return weeks[num - 1];
    }
}
