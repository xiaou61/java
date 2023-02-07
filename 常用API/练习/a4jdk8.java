package 常用API.练习;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class a4jdk8 {
    public static void main(String[] args) {
        LocalDate ld1=LocalDate.of(2004,11,27);

        LocalDate ld2 = LocalDate.now();


        //计算间隔的运算法则是前面减去后面
        long days = ChronoUnit.DAYS.between(ld1,ld2);
        System.out.println(days);

    }
}
