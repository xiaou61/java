package 常用API;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class a22 {
    public static void main(String[] args) {
        Instant now=Instant.now();
        System.out.println(now);
        //获取指定的
        Instant instant1 = Instant.ofEpochMilli(0L);
        Instant instant2 = Instant.ofEpochSecond(1L);
        Instant instant3 = Instant.ofEpochSecond(1L,1000000000L);

        System.out.println(instant1);
        System.out.println(instant2);
        System.out.println(instant3);




        //指定时区
        ZonedDateTime time = Instant.now().atZone(ZoneId.of("Asia/Shanghai"));
        System.out.println(time);



        //isxxx

        Instant instant4 = Instant.ofEpochMilli(0L);
        Instant instant5 = Instant.ofEpochMilli(10000L);

        boolean reuslt = instant4.isBefore(instant5);//判断她在不在参数的前面

        boolean result = instant4.isAfter(instant5);
        System.out.println(reuslt);
        System.out.println(result);

        //减少时间
        Instant instant6=Instant.ofEpochMilli(3000L);
        System.out.println(instant6);
        Instant instant7 = instant6.minusSeconds(1);//往前减去一秒
        System.out.println(instant7);

    }

}
