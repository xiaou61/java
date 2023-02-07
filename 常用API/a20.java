package 常用API;

import java.util.Calendar;
import java.util.Date;

public class a20 {
    public static void main(String[] args) {
        //获取一个日历对象,calender是一个抽象类，不能直接new，而是通过一个静态方法去获取子类对象
        //底层原理：会根据系统的不同时区来获得不同的日历对象
        //会把时间中的纪元，年月日等放到一个数组当中,默认表示当前时间
        //在日历对象中，如果获取的是月份，范围是0~11
        //星期，星期日是一周中的第一题天。
        Calendar c = Calendar.getInstance();

        //修改日历代表的时间

        Date d=new Date(0L);

        //0:纪元
        //1:当前的年份
        //2:月
        //3：一年当中的第几周
        //4：一个月中的第几周
        //5：一个月中的第几天。等等等等
        c.add(Calendar.MONTH,1);//正数是往后加，负数是往后减
        int year = c.get(Calendar.YEAR);
        int month = c.get(Calendar.MONTH)+1;
        int date = c.get(Calendar.DAY_OF_MONTH);
        int week = c.get(Calendar.DAY_OF_WEEK);



        System.out.println(year+", "+month + ", "+date+" "+getWeekString(week));


    }

    //查表法：让数据和索引产生关系。
    public static String getWeekString(int index){
        //定义一个数组
        String arr[]={"","星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
        return arr[index];
    }
}
