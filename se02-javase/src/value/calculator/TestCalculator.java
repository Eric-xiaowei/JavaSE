package value.calculator;


import org.junit.Test;

/**
 * 五条运算规则：
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-11:25
 */
public class TestCalculator {
    //1.运算结果与大类型一致：
    @Test
    public void test1(){
        System.out.println(3.14*5);//15.700000000000001,结果为double类型
        System.out.println(3/2);//1，结果为int类型
        System.out.println(3D/2);//1.5，结果为double类型
    }

    //2.byte、short、char在进行运算后，整体结果已经自动转化为int类型；
    @Test
    public void test2(){

        byte a = 1;
        byte b = 2;

        //byte c = a + b; 报错：a+b经过运算以后，变成了int类型了
        byte c = (byte) (a + b);
        System.out.println(c);

        byte c1 = 3;
        // c1 = c1 + 2; 报错：c1 是byte类型，2为int类型，运算结果为大类型：int类型
        c1 = (byte) (c1 + 2);
        c1 += 2;//与上面的运算等价，自动完成类型转化，这种复合运算符+=是不能够分开的。
        System.out.println(c1);

        char d1 = 65;
        System.out.println(d1);
        char d2 = 66;
        System.out.println(d2);
        //char d3 = d1 + d2; 报错：d1 + d2为整型，需要进行转型才可以。
        char d3 = (char) (d1 + d2);
        System.out.println(d3);//有结果，但不可见

        //byte与short进行混合：
        byte d4  = (byte) (d1 + a);
        System.out.println(d4);
    }

    //整数运算的溢出现象：
    @Test
    public void test3(){
        System.out.println(300000000L*60*60*24*365);//9460800000000000：未溢出，运算结果跟大类型一致
        System.out.println(300000000*60*60*24*365);//659193856:溢出
    }
    //浮点数运算不精确与特殊值;
    @Test
    public void test4(){
        System.out.println(1-0.9);//0.09999999999999998
        System.out.println(3.14/0);//Infinity无穷大：浮点数运算分母可以为0
        System.out.println(0/0F);//NaN:不是一个数
    }

}
