package api.date;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**JDK1.8的新特性
 * @author:ZhangXiaowei
 * @create:2020-08-2020/8/25-19:10
 */
public class TestDateTimeFormatter {
    public static void main(String[] args) {
        //jdk1.8的特性：日期转字符串
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        System.out.println(dateTimeFormatter.format(LocalDateTime.now()));

        //字符串转日期：
        LocalDateTime dateTime = LocalDateTime.parse("2019/11/30 15:16:17", dateTimeFormatter);
        System.out.println(dateTime);
    }
}
