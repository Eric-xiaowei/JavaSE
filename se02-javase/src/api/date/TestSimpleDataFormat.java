package api.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**这个类用来测试日期格式化解析工具类：
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/24-10:43
 */
public class TestSimpleDataFormat {
    /**
     * 计算我们自己的存活天数：
     * @param args
     */
    public static void main(String[] args) throws ParseException {
        System.out.println("请输入您的生日：按照：2000/12/25");
        //1.用户输入字符串时间：
        String birthday = new Scanner(System.in).nextLine();
        //2.对时间格式进行设置：
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd");
        //3.对时间格式进行解析：
        Date birth = simpleDateFormat.parse(birthday);
        //System.out.println(birth);
        //4.获取出生日期的时分秒：
        long bir = birth.getTime();
        //5.获取当前时间的时分秒：
        long now = System.currentTimeMillis();
        //6.作个时间差：
        System.out.println("您已经存活了："+(now-bir)/1000/60/60/24);


    }
}
