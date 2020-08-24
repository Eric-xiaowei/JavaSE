package faq;

import com.sun.istack.internal.Nullable;

/**
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/24-18:40
 */
public class TestCompare {
    public static void main(String[] args) {
        boolean res =compare(1,1);
        System.out.println(res);
    }
    static boolean compare(@Nullable Object obj1, @Nullable Object obj2){
        System.out.println(obj1);
        System.out.println(obj1.toString());
        //return obj1.toString()==obj2.toString();//false
        return obj1.toString().equals(obj2.toString());//true
    }
}
