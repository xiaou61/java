package 常用API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.SimpleTimeZone;

public class a17 {
    public static void main(String[] args) throws ParseException {
        method1();
        method2();






    }

    private static void method2() throws ParseException {
        //解析
        String str="2023-11-11 11:11:11";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date parse = sdf.parse(str);
        System.out.println(parse.getTime());
    }

    private static void method1() {
        SimpleDateFormat sdf=new SimpleDateFormat();

        Date d=new Date(0L);
        String str = sdf.format(d);
        System.out.println(str);//默认的

        //使用带参指定
        SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String str2 = sdf2.format(d);
        System.out.println(str2);
    }
}
