package array;

import java.util.Arrays;

/**数组的API
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-15:13
 */
public class TestArray1 {
    public static void main(String[] args) {
        int [] a = new int[] {1,5,8,4,5,6,7,8};

        //1.toString()方法;
        System.out.println(Arrays.toString(a));

        //2.数组排序方法：parallelSort()方法：从小到大
        Arrays.parallelSort(a);
        System.out.println(Arrays.toString(a));

        //3.数组复制的方法：CopyOf()、copyOfRange()
        int[] b = Arrays.copyOf(a,10);
        System.out.println(Arrays.toString(b));//新创建的数组多出来的长度，空出来的部分会使用默认值

        int[] c = Arrays.copyOfRange(a,1,3);
        System.out.println(Arrays.toString(c));//左闭右开区间


    }
}
