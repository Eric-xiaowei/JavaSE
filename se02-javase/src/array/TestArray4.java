package array;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class TestArray4 {
    public static void main(String[] args) {

        //测试:数组转集合的方法:
        Integer[] a = {1,2,3};
        List<Integer> list = Arrays.asList(a);
        System.out.println(list);

        //测试集合转数组:
        Integer[] b = (Integer[]) list.toArray();
        System.out.println(Arrays.toString(b));

        //集合转字符串:
        String s = list.toString();
        System.out.println(s);
    }

}
