package 常用API;

import java.util.Date;
import java.util.Random;

public class a16 {
    public static void main(String[] args) {
        extracted();

        extracted1();

    }

    private static void extracted1() {
        Random r=new Random();

        //创建俩个时间对象
        Date d1=new Date(Math.abs(r.nextInt()));


        Date d2=new Date(Math.abs(r.nextInt()));


        if (d1.getTime() > d2.getTime()) {
            System.out.println("第一个时间在后面，第二个时间在前面");
        }else if (d1.getTime() < d2.getTime()){
            System.out.println("第二个时间在后面，第二个时间在前面");
        }else {
            System.out.println("两个时间一样");
        }
    }

    private static void extracted() {
        //创建一个对象表示时间原点
        Date d1=new Date(0L);
        long time = d1.getTime();


        //在这个基础上加一年的ms值

        time= time + 1000L * 60 * 60 * 24 * 365;

        d1.setTime(time);

        System.out.println(d1);
    }
}
