package string;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-10:27
 */
public class TestEquals {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        System.out.println("int类型比较:"+(a==b));

        String s1="abc";//至少创建一次对象
        String s2="abc";
        String s3="ab"+"c";
        String s4=new String("abc");
        System.out.println("String类型同值==比较:"+(s1==s2));
        System.out.println("String类型同值equals比较:"+s1.equals(s2));
        System.out.println("String类型拼接后同值==比较:"+(s1==s3));
        System.out.println("String类型拼接后同值equals比较:"+s1.equals(s3));
        System.out.println("String类型对象同值==比较:"+(s1==s4));
        //String类为最终类，并重写了equals方法：先比较地址值，地址值相等则直接相等，若地址值不等则比较属性值是否相等。
        System.out.println("String类型同值equals比较:"+s1.equals(s4));
    }
}
