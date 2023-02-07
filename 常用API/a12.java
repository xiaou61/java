package 常用API;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.sql.SQLOutput;

public class a12 {
    public static void main(String[] args) {
        BigDecimal bd1=BigDecimal.valueOf(10.0);
        BigDecimal bd2 = BigDecimal.valueOf(4.0);
        BigDecimal bd3 = bd1.add(bd2);
        System.out.println(bd3);

        BigDecimal bd4 = bd1.subtract(bd2);
        System.out.println(bd4);

        BigDecimal bd5 = bd1.multiply(bd2);
        System.out.println(bd5);

        //除法,如果除不尽的话，会报错
        BigDecimal bd6 = bd1.divide(bd2);
        System.out.println(bd6);

        //要是想不报错，需要设置保留几位
        //half_up表示四舍五入
        BigDecimal bd7 = bd2.divide(bd1,2, RoundingMode.HALF_UP);




    }


}
