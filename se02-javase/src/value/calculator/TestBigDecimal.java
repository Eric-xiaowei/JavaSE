package value.calculator;


import java.math.BigDecimal;
import java.util.Scanner;

/**这个类用来解决浮点数计算不精确的问题
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-17:20
 */
public class TestBigDecimal {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //method1();//这个方法用来暴露浮点数运算不精确的问题
        method2();//这个方法用来解决浮点数运算不精确的问题
    }

    private static void method2() {
        System.out.println("请输入：");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        //创建BigDecimal的类;
        BigDecimal a1 = new BigDecimal(a + "");
        BigDecimal b1 = new BigDecimal(b + "");

        //进行数据的运算：
        System.out.println(a1.add(b1));
        System.out.println(a1.subtract(b1));
        System.out.println(a1.multiply(b1));
        System.out.println(a1.divide(b1,3,BigDecimal.ROUND_HALF_UP));

    }

    private static void method1() {
        System.out.println("请输入：");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        //进行运算：
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
    }
}
