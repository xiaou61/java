package 常用API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a18 {
    public static void main(String[] args) throws ParseException {
        String str="2000-11-11";
        SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
        Date date = sdf1.parse(str);

        //格式化
        SimpleDateFormat sdf2 = new SimpleDateFormat("yyyy年MM月dd日");
        String result = sdf2.format(date);
        System.out.println(result);


    }
}
