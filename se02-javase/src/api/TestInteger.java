package api;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-17:39
 */
public class TestInteger {
    public static void main(String[] args) {
        //1.基本类型转化为包装类的方式：3种方式
        Integer a = new Integer(5);
        Integer b = Integer.valueOf(5);//在-127到128内使用静态方法valueOf()比较高效，相同的数据只会存储一次
        Integer c = 5;
        System.out.println(a+b+c);
        System.out.println(a==b);//false
        System.out.println(b==c);//true

        //包装类型转化为基本类型的方式;
        int a1 = a.intValue();
        System.out.println(a1);
        int a2 = a;
        System.out.println(a2);

    }
}
