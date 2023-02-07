package 常用API;

import java.sql.SQLOutput;
import java.util.Date;

public class a15 {
    public static void main(String[] args) {
        Date d1=new Date();
        System.out.println(d1);

        //创建对象表示一个指定的时间,从时间原点开始，过了多少0ms的时间
        Date d2 = new Date(0L);
        System.out.println(d2);

        //settime修改时间x
        d2.setTime(1000L);


        //用get来获取当前时间的ms
        long time = d2.getTime();
        System.out.println(time);
    }

}
