package calculator;


/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-14:44
 */
public class TestIncrease {
    public static void main(String[] args) {
        int a = 1;
        int b = 1;
        int c = 1;

        c = c++;//c=1
        System.out.println(c);//1

        System.out.println(a++);//1
        System.out.println(++b);//2
        System.out.println(a);//2

        //总结:这类题型的解题思路
        //分两路进行思考：a.输出的值：包括在表达式中，或者在输出语句中
        //              b.变量的实际值为多少，不管是++在前还是++在后，都会+1;

    }
}
