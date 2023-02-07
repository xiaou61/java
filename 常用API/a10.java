package 常用API;

import java.math.BigInteger;

public class a10 {
    public static void main(String[] args) {
        //创建俩个bigInteger对象
        BigInteger bd1= BigInteger.valueOf(10);
        BigInteger bd2= BigInteger.valueOf(5);
        BigInteger bd3= bd1.add(bd2);
        System.out.println(bd3);


        //除法获得商和余数
        BigInteger[] bigIntegers = bd1.divideAndRemainder(bd2);
        System.out.println(bigIntegers[0]);//商
        System.out.println(bigIntegers[1]);//余数
        //比较是否相同
        boolean result = bd1.equals(bd2);
        System.out.println(result);

        //次幂
        BigInteger bd4 = bd1.pow(2);
        System.out.println(bd4);

        //max
        BigInteger max = bd1.max(bd2);
        System.out.println(max);


        //intvalue,超出范围会报错
        BigInteger bd5=BigInteger.valueOf(1000);
        int i=bd5.intValue();
        System.out.println(i);
        //longvalue
        long l = bd5.longValue();
        //doublevalue
        double v = bd5.doubleValue();
        System.out.println(v);
        System.out.println(l);

    }
}
