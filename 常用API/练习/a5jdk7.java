package 常用API.练习;

import java.util.Calendar;

public class a5jdk7 {
    public static void main(String[] args) {
        //这里把时间设置为 2000年3月1日，之后往前减去一天，看当前时间是28号还是29号
        Calendar c = Calendar.getInstance();
        c.set(2000,2,1);//月份的范围是0~11
        c.add(Calendar.DAY_OF_MONTH,-1);//负数表示往前减
        int day = c.get(Calendar.DAY_OF_MONTH);
        System.out.println(day);
        if (day==28){
            System.out.println("平年");
        }else if (day==29){
            System.out.println("闰年");
        }else{
            System.out.println("6");
        }

    }
}
