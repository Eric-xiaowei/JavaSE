package array;

import java.util.Arrays;

/**char类型的数组可以直接进行打印，其他数组则打印地址值：
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-15:36
 */
public class TestArray2 {
    public static void main(String[] args) {
        char[] a = new char[]{'h','e','l','l','o'};
        int[] b = new int[]{1,5,4,5,5,8};
        System.out.println(Arrays.toString(a));//[h, e, l, l, o]
        System.out.println(a);//hello
        System.out.println(b);//[I@1540e19d
    }
}
