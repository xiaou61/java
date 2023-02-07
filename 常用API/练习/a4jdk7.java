package 常用API.练习;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a4jdk7 {
    public static void main(String[] args) throws ParseException {
        //需要先获取当前时间的毫秒值
        //计算出生年月日的毫秒值


        String birthday="2004年11月27日";

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日");

        Date date = sdf.parse(birthday);

        long birthdayTime = date.getTime();


        //获取当前的毫秒值


        long todayTime= System.currentTimeMillis();

        long time = todayTime - birthdayTime;


        System.out.println(time/1000/60/60/24);


    }
}
