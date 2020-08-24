package api.string;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/22-11:03
 */
public class TestString {
    public static void main(String[] args) {
        //测试：将一个字符串进行翻转的方法：
        //方法一：
        String a = "abcdefg";
        String b = "";
        char[] chars = a.toCharArray();
        for(int i=chars.length-1;i>=0;i--){
            b += chars[i];
        }
        System.out.println(b);

        //方法二：
        StringBuffer buffer = new StringBuffer("abcdefg");
        StringBuffer reverse = buffer.reverse();
        System.out.println(reverse);
        String s = reverse.toString();
        System.out.println(s);

        //String创建对象的次数：
        String s2=new String("c");//至少创建一次对象：

        //测试：String和StringBuffer的区别：
        String s1 = "abc";
        System.out.println(s1.hashCode());
        s1="bcd";
        System.out.println(s1.hashCode());

        StringBuffer abc = new StringBuffer("abc");
        System.out.println(abc.hashCode());
        abc= abc.reverse();
        System.out.println(abc.hashCode());

    }
}
