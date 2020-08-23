package value;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-10:32
 */
public class TestValue {
    public static void main(String[] args) {
        //几种常见的错误：
        //1.整数类型字面值错误：一般整数的字面值为int类型
        //int a = 10000000000000;数值的字面值仍然是整型，但是已经超出了整型的范围
        //int a = 1000000000000L;long类型的数值范围正确，但是字面值是int类型的，类型不匹配
        //int a = （int）100000000000;数值的字面值是整型，但是超出范围，与第一条为同一个错误。
        int a = (int) 10000000000L;//此条表述正确，值为：1410065408，溢出部分。
        System.out.println(a);

        //2.浮点数类型的字面值错误：一般浮点数的字面值为double类型
        //float b = 3.14;数值的字面值为double类型的，
    }
}
