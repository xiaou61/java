package 常用API;

import java.time.LocalDate;
import java.time.Period;

public class a23 {
    public static void main(String[] args) {
        //当前本地年月日
        LocalDate today=LocalDate.now();
        System.out.println(today);

        //生日的年月日
        LocalDate birthDate=LocalDate.of(2022,2,3);
        System.out.println(birthDate);

        Period period = Period.between(birthDate,today);//第二个参数减去第一个参数

        System.out.println("相差的时间对象"+period);

        System.out.println(period.getYears());
        System.out.println(period.getMonths());
        System.out.println(period.getDays());

        System.out.println(period.toTotalMonths());//相差的总月份
    }
}
