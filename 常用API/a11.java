package 常用API;

import java.math.BigDecimal;

public class a11 {
    public static void main(String[] args) {
        //这种方式有可能是不精确的，所以不建议使用
        BigDecimal bd1=new BigDecimal(0.01);
        BigDecimal bd2 = new BigDecimal(0.02);
        System.out.println(bd1);
        System.out.println(bd2);
        //这个的输出结果就已经是非常的精确的了
        BigDecimal bd3 = new BigDecimal("0.01");
        BigDecimal bd4 = new BigDecimal("0.09");
        System.out.println(bd3);
        System.out.println(bd4);

        //这样相加的结果就是精确的
        BigDecimal bd5 = bd3.add(bd4);
        System.out.println(bd5);


        //通过静态方法来获取对象
        BigDecimal bd6 = BigDecimal.valueOf(10);
        System.out.println(bd6);

        //如果要表示的数字不大，没有超出double的取值范围，那么建议使用valueof
        //如果要表示的数字比较大，超出了double的取值范围，建议使用构造方法。
        //如果我们传递的是0~10之间的整数，那么方法会返回已经创建好的对象，不会重新new




    }
}
