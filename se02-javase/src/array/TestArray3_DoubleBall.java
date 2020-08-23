package array;

import java.util.Arrays;
import java.util.Random;

/**【问题】：随机在0-33中随机生成5个不重复的红球，在0-16中随机生成一个篮球
 * 【分析】：1.在0-33中随机生成不重复的红球的方法
 *          2.在0-16中随机生成一个篮球的方法
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/23-15:41
 */
public class TestArray3_DoubleBall {
    public static void main(String[] args) {
        int[] r = cjsz(33);
        int[] b = cjsz(16);
        
        //随机选择红球的方法：
        int[] red = xhq(r);
        int[] blue = xlq(b);

        //展示最终结果：
        System.out.println(Arrays.toString(red));
        System.out.println(Arrays.toString(blue));
    }

    //随机选择篮球的方法：
    private static int[] xlq(int[] b) {
        int [] a = new int[5];
        Random random = new Random();
        for(int i=0;i<a.length;i++){
            int index = random.nextInt(b.length);
            a[i] = index;
        }
        return a;
    }

    //选择红球的方法：【标记思想】
    private static int[] xhq(int[] r) {
        //1.创建最终数组与标记数组：
        boolean[] a = new boolean[33];
        int[] b = new int[5];
        //2.如何通过标记思想进行去重：
        Random random = new Random();
        int index;
        for(int i=0;i<b.length;i++){
            do{
                index = random.nextInt(33);
            } while (a[index]==true);
            b[i]=index;
            a[index]=true;
        }
        return b;
    }

    //创建数组并给数组进行赋值的方法：
    private static int[] cjsz(int i) {
        int[] a = new int[i];
        for(int j=0;j<a.length;j++){
            a[j]=j+1;
        }
        return a;
    }

}
