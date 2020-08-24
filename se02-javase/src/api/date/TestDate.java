package api.date;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestDate {
    public static void main(String[] args) throws ParseException {
        //日期格式转字符串
        String format = new SimpleDateFormat("yyyy-MM-dd").format(new Date());
        System.out.println(format);

        //字符串转日期格式:
        Date parse = new SimpleDateFormat("yyyy-MM-dd").parse(format);//输入的是字符串
        System.out.println(parse);

    }
}
