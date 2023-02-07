package 常用API;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class a19 {
    public static void main(String[] args) throws ParseException {
        //秒杀活动
        String statstr="2023年11月11日 0:01:0";
        String endstr="2023年11月11日 0:10:0";
        String orderstr="2023年11月11日 0:01:0";

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date startdate = sdf.parse(statstr);
        Date enddate = sdf.parse(endstr);
        Date orderdate = sdf.parse(orderstr);


        long starttime = startdate.getTime();
        long endtime = enddate.getTime();
        long ordertime = orderdate.getTime();

        if (ordertime>=starttime && ordertime <= endtime) {
            System.out.println("参加秒杀活动成功");
            }else {
            System.out.println("参加秒杀活动失败");
            }
    }
}
