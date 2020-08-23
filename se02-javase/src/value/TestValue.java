package value;

import java.util.Arrays;

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
        //float b = 3.14;数值的字面值为double类型的，字面类型与实际类型不匹配
        float b = 3.14F;
        System.out.println(b);
        double c = 3.14;
        double d = 3.14F;
        double e = 3;//字面值为整型的数据，但是double为大类型数据甚至比long类型都要大，因此小转大没问题。
        System.out.println(c+"==="+d+"==="+e);

        //3.关于char类型的数据：
        char a1 = 65; //char类型的数据，可以直接存储一个数字，底层自动查询ASCII码表，超过的部分查询：Unicode表
        //这里是封装了下面的过程，其实还是存在一个转型的过程。
        System.out.println(a1);
        char a2 = (char)65; //这里表示将字面值为整数的65，转化为char类型的数据，再到码表中进行查询。
        System.out.println(a2);
        //char b1 = 'cd'; char类型的数据只能存储一个字符的数据，超过一个就无法存储，超过一个的叫字符串，需要String类型
        char a3 = '中';
        System.out.println(a3);//char类型的数据是可以存储汉字的。0-65536，char类型默认字符集Unicode，包含汉字，固定长编码为2个字节

        //4.使用char类型生成一个26个字母表：要求大写和小写各一份;
        //4.1 生成大写字母表：
        char[] letters = new char[26];
        for(int i=65;i<65+letters.length;i++){
            letters[i-65] = (char) i;//如果是数字的话，不用进行强转。
        }
        System.out.println(Arrays.toString(letters));//char类型的数组是可以直接进行打印的。

        //4.2 生成小写的字母表：
        char[] lowerLetter = new char[26];
        for(int i=0;i<lowerLetter.length;i++){
            lowerLetter[i] = (char) (i+97);
        }
        System.out.println(Arrays.toString(lowerLetter));


    }
}
