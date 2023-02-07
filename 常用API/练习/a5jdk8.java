package 常用API.练习;

import java.time.LocalDate;

public class a5jdk8 {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.of(2000, 3, 1);

        boolean leapYear = ld.isLeapYear();
        if (leapYear){
            System.out.println("闰年");
        }else {
            System.out.println("平年");
        }

    }
}
