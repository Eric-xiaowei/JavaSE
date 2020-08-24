package io;

import java.io.File;

/**
 * 这个类用来练习如何用递归方法计算指定目录下的文件总大小
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/24-15:58
 */
public class TestFile {
    public static void main(String[] args) {
        File f = new File("F:\\workspace_02");
        long size = size(f);//这个方法用来计算文件夹内文件总大小：
        System.out.println(size);
    }

    private static long size(File f) {
        File[] files = f.listFiles();
        long sum = 0;
        for(File i : files){
            if(i.isFile()){//如果是一个文件，那么直接计算它的大小
                sum += i.length();
            }else {
                sum += size(i);
            }
        }
        return sum;
    }
}
