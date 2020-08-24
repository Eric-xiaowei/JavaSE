package api.string;

import org.junit.Test;

/**这个类用来测试String的方法
 * 1.使用工具类，首先创建对象：如何创建字符串对象
 * 2.字符串是一个最终类，不能被继承。
 * 3.字符串底层维护了一个char类型的数组，会把数据存储到char数组中，而且存储的值为常量，值不能被修改。
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/24-11:02
 */
public class TestString2 {
    //1.创建字符串对象的方法：
    //1.1
    private char[] chars = {'a','b','c'};
    private String str = new String(chars);
    //1.2
    private byte[] bytes = {97,98,99};
    private String str2 = new String(bytes);
    //1.3
    private String str3 = "abc";

    //获取某个字符的位置，获取某个位置的字符
    @Test
    public void test1(){
        int b = str.indexOf("b");
        char charAt = str.charAt(b);
        System.out.println(charAt);
    }
    //对字符串进行切割：
    @Test
    public void test2(){
        String sub1 = str.substring(1);
        String sub2 = str.substring(1, 2);//左闭右开区间，左边取到，右边取不到。
        System.out.println(sub1);
        System.out.println(sub2);
    }
    //对字符串两边多余的空格进行清除
    @Test
    public void test3(){
        str="   dfdfdf   ";
        String trim = str.trim();
        System.out.println(trim);
    }

    @Test
    public void test4(){
        System.out.println(String.valueOf(9.9)+1);
    }





}
