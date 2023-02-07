package 常用API;

import java.time.ZoneId;
import java.util.Set;

public class a21 {
    public static void main(String[] args) {
        //1获取所有的时区。
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
        //设置默认时区
        ZoneId zoneId = ZoneId.systemDefault();
        System.out.println(zoneId);//默认就是上海


        //指定时区
        ZoneId of = zoneId.of("Asia/Pontianak");
        System.out.println(of);

        
    }
}
