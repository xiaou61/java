package 常用API;

import java.math.BigInteger;
import java.util.Random;

public class a9 {
    public static void main(String[] args) {
        //获得一个随机的大整数

        for (int i = 0; i < 100; i++) {
            BigInteger bd1=new BigInteger(20,new Random());
            System.out.println(bd1);
        }
        //获取一个指定的大整数这个比较常用
        BigInteger bd2 = new BigInteger ("1000456666666666666665479861232132345465445123122156456468898");
        System.out.println(bd2);

        //获得指定进制的大整数

        BigInteger bd3 = new BigInteger("1756",8);
        System.out.println(bd3);

        //另外一种获取的方式。
        //细节：能表示的范围比较小，在long的取值范围之内。
        //在内部，对常用的数字：-16~16进行了优化
        //提前把-16~16的对象创建好，如果多次获取那么不会创建新的
        BigInteger bd5 = BigInteger.valueOf(100);
        System.out.println(bd5);


    }
}
